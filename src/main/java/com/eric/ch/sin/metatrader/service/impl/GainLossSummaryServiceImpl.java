package com.eric.ch.sin.metatrader.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.eric.ch.sin.metatrader.entity.GainLossSummary;
import com.eric.ch.sin.metatrader.repository.GainLossSummaryRepository;
import com.eric.ch.sin.metatrader.service.GainLossSummaryService;

@Service
public class GainLossSummaryServiceImpl implements GainLossSummaryService{

	@Autowired
	private GainLossSummaryRepository gainLossSummaryRepository;


	/**
	 * Get total number of summaries in database
	 * @return total number of summaries 
	 * */
	@Override
	public long getNumberOfSummaries() {
		return gainLossSummaryRepository.count();
	}

	/**
	 * Get gain loss summaries in the specified page according to specified sorting
	 * @param sortBy: Field to be sorted (e.g. 'username')
	 * @param pageNum: Page Number to display (10 items in one page)
	 * @param order: either 'ASC' or 'DESC'
	 * @return GainLossSummaries: gain loss summaries
	 * */
	@Override
	public List<GainLossSummary> getAllSummaries(String sortBy, int pageNum, String order) {
		List<GainLossSummary> list = new ArrayList<>();
		PageRequest pageRequest = null;
		if (order.equalsIgnoreCase("DESC")) {
			pageRequest = PageRequest.of(pageNum - 1, 10, Sort.Direction.DESC, sortBy);
		} else {
			pageRequest = PageRequest.of(pageNum - 1, 10, Sort.Direction.ASC, sortBy);
		}
		gainLossSummaryRepository.findAll(pageRequest).forEach(e -> list.add(e));
		return list;
	}
}


