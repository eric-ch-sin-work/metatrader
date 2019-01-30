package com.eric.ch.sin.metatrader.service;

import com.eric.ch.sin.metatrader.entity.OperationCenter;

public interface OperationCenterService {

	/**
	 * Get operation centers in the specified page according to specified sorting
	 * @param sortBy: Field to be sorted (e.g. 'name')
	 * @param pageNum: Page Number to display (10 items in one page)
	 * @param order: either 'ASC' or 'DESC'
	 * @return List of OperationCenter
	 * */
    public Iterable<OperationCenter> getAllOperationCenters(String sortBy, int pageNum,  String order);

	/**
	 * Get total number of operation centers
	 * @return total number of OperationCenter
	 * */
	public long getNumberOfOpeartionCenters();

	/**
	 * Get total number of users
	 * @return total number of users
	 * */
	public long getNumberOfUsers();
}
