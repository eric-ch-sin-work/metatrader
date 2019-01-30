package com.eric.ch.sin.metatrader.service;

import java.util.List;

import com.eric.ch.sin.metatrader.entity.GainLossSummary;

public interface GainLossSummaryService {

	public long getNumberOfSummaries();

	public List<GainLossSummary> getAllSummaries(String sortBy, int pageNum, String order);
}
