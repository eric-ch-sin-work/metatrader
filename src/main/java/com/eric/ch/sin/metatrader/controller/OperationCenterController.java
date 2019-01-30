package com.eric.ch.sin.metatrader.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eric.ch.sin.metatrader.entity.OperationCenter;
import com.eric.ch.sin.metatrader.service.OperationCenterService;

@RestController
@RequestMapping(path="/v1/operationcenters")
public class OperationCenterController {

	@Autowired
	private OperationCenterService operationCenterService;

	/**
	 * Get operation centers in the specified page according to specified sorting
	 * @param optionalSort: Field to be sorted (e.g. 'name')
	 * @param optionalPageNum: Page Number to display (10 items in one page)
	 * @param optionalOrder: either 'ASC' or 'DESC'
	 * @return List of OperationCenter
	 * */
    @GetMapping("")
    public Iterable<OperationCenter> getAllOperationCenters(
    		@RequestParam("sort") Optional<String>  optionalSort,
    		@RequestParam("pageNum") Optional<Integer>  optionalPageNum,
    		@RequestParam("order") Optional<String>  optionalOrder) {
    	String sortBy = null;
    	Integer pageNum = null;
    	String order = null;
    	if (optionalSort.isPresent() == true && !optionalSort.get().trim().equals("")) {
    		sortBy = optionalSort.get();
    	} else {
    		sortBy = "name";
    	}
    	if (optionalPageNum.isPresent() == true) {
    		pageNum = optionalPageNum.get();
    	} else {
    		pageNum = 1;
    	}
    	if (optionalOrder.isPresent() == true) {
    		order = optionalOrder.get();
    	} else {
    		order = "ASC";
    	}
		return operationCenterService.getAllOperationCenters(sortBy, pageNum, order);
    }

	/**
	 * Get summaries of all operation 
	 * @return JSON of summary
	 * */
    @GetMapping(value="/summaries", produces = "application/json; charset=UTF-8")
    public String getSummary() {
    	long totalOperationCenters = operationCenterService.getNumberOfOpeartionCenters();
    	long totalUsers = operationCenterService.getNumberOfUsers();
    	return String.format("{\"totalUsers\": %d%n, \"totalOrders\": 100481, \"totalOperationCenters\": %d%n}", totalUsers, totalOperationCenters);
    }
}
