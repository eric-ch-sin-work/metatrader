package com.eric.ch.sin.metatrader.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.eric.ch.sin.metatrader.entity.GainLossSummary;


public interface GainLossSummaryRepository  extends PagingAndSortingRepository<GainLossSummary, Integer> {

}
