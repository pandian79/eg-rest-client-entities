package com.eg.api.client.entity;

import java.util.List;
/**
 * Represents the alarm history response from the API.
 * Contains a summary of the alarm history and detailed records of problems.
 */
public class AlarmHistory {
	AlarmHistorySummary summary;
	List<AlarmHistoryRecord> problemDetails;
	public AlarmHistorySummary getSummary() {
		return summary;
	}
	public void setSummary(AlarmHistorySummary summary) {
		this.summary = summary;
	}
	public List<AlarmHistoryRecord> getProblemDetails() {
		return problemDetails;
	}
	public void setProblemDetails(List<AlarmHistoryRecord> problemDetails) {
		this.problemDetails = problemDetails;
	}
	@Override
	public String toString() {
		return "AlarmHistory [summary=" + summary + ", problemDetails=" + problemDetails + "]";
	}
	
}
