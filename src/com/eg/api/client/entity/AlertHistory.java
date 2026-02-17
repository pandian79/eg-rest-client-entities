package com.eg.api.client.entity;

import java.util.List;
import java.util.Map;

/**
 * The Class Alert. Entity object for eG Alert 
 * @see com.eg.api.client.dao.AlarmsRepository
 */
public class AlertHistory {
	Map<String, String> [] summary;
	List<Alert> problemDetails;
	public Map<String, String>[] getSummary() {
		return summary;
	}
	public void setSummary(Map<String, String>[] summary) {
		this.summary = summary;
	}
	public List<Alert> getProblemDetails() {
		return problemDetails;
	}
	public void setProblemDetails(List<Alert> problemDetails) {
		this.problemDetails = problemDetails;
	}
	
}
