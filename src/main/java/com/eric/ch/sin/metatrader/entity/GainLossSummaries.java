package com.eric.ch.sin.metatrader.entity;

import java.util.List;

public class GainLossSummaries {
	
	private long count;
	private List<GainLossSummary> summaries;

	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public List<GainLossSummary> getSummaries() {
		return summaries;
	}
	public void setSummaries(List<GainLossSummary> summaries) {
		this.summaries = summaries;
	}
}
