package com.eric.ch.sin.metatrader.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.eric.ch.sin.metatrader.entity.OperationCenter;

public interface OperationCenterRepository  extends PagingAndSortingRepository<OperationCenter, Integer> {


    @Query("SELECT SUM(oc.totalUsers) from OperationCenter oc")
	public long getNumberOfUsers();
}
