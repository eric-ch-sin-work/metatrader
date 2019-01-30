package com.eric.ch.sin.metatrader.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.eric.ch.sin.metatrader.entity.OperationCenter;
import com.eric.ch.sin.metatrader.repository.OperationCenterRepository;
import com.eric.ch.sin.metatrader.service.OperationCenterService;

@Service
public class OperationCenterServiceImpl implements OperationCenterService{
	
	@Autowired
	private OperationCenterRepository operationCenterRepository;

	/**
	 * Get operation centers in the specified page according to specified sorting
	 * @param sortBy: Field to be sorted (e.g. 'name')
	 * @param pageNum: Page Number to display (10 items in one page)
	 * @param order: either 'ASC' or 'DESC'
	 * @return List of OperationCenter
	 * */
	@Override
    public List<OperationCenter> getAllOperationCenters(String sortBy, int pageNum, String order) {
		List<OperationCenter> list = new ArrayList<>();
		PageRequest pageRequest = null;
		if (order.equalsIgnoreCase("DESC")) {
			pageRequest = PageRequest.of(pageNum - 1, 100, Sort.Direction.DESC, sortBy);
		} else {
			pageRequest = PageRequest.of(pageNum - 1, 100, Sort.Direction.ASC, sortBy);
		}
		operationCenterRepository.findAll(pageRequest).forEach(e -> list.add(e));
		return list;
    }

	/**
	 * Get total number of operation centers
	 * @return total number of OperationCenter
	 * */
	@Override
	public long getNumberOfOpeartionCenters() {
		return operationCenterRepository.count();
	}

	/**
	 * Get total number of users
	 * @return total number of users
	 * */
	@Override
	public long getNumberOfUsers() {
		return operationCenterRepository.getNumberOfUsers();
	}
}
