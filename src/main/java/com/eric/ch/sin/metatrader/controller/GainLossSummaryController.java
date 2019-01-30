package com.eric.ch.sin.metatrader.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eric.ch.sin.metatrader.entity.GainLossSummaries;
import com.eric.ch.sin.metatrader.entity.GainLossSummary;
import com.eric.ch.sin.metatrader.service.GainLossSummaryService;

@RestController
@RequestMapping(path="/v1/gainloss/summaries")
public class GainLossSummaryController {

	@Autowired
	private GainLossSummaryService service;

	/**
	 * Get gain loss summaries in the specified page according to specified sorting
	 * @param optionalSort: Field to be sorted (e.g. 'username')
	 * @param optionalPageNum: Page Number to display (10 items in one page)
	 * @param optionalOrder: either 'ASC' or 'DESC'
	 * @return GainLossSummaries: gain loss summaries
	 * */
    @GetMapping("")
    public GainLossSummaries getAllSummaries(
    		@RequestParam("sort") Optional<String>  optionalSort, 
    		@RequestParam("page") Optional<Integer>  optionalPageNum,
    		@RequestParam("order") Optional<String>  optionalOrder) {
		GainLossSummaries summaries = new GainLossSummaries();
		List<GainLossSummary> summaryList = null;
    	String sortBy = null;
    	Integer pageNum = null;
    	String order = null;
    	if (optionalSort.isPresent() == true && !optionalSort.get().trim().equals("")) {
    		sortBy = optionalSort.get();
    	} else {
    		sortBy = "username";
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
    	summaryList = service.getAllSummaries(sortBy, pageNum, order);
		long count =  service.getNumberOfSummaries();
		summaries.setCount(count);
		summaries.setSummaries(summaryList);
		return summaries;
    }
}
