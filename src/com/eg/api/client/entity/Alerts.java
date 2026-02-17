package com.eg.api.client.entity;

import java.util.Arrays;
import java.util.Map;

/**
 * The Class Alert. Entity object for eG Alert 
 * @see com.eg.api.client.dao.AlarmsRepository
 */
public class Alerts {
	Integer total;
	Map<String, String> [] summary;
	Alert [] data;
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Map<String, String>[] getSummary() {
		return summary;
	}
	public void setSummary(Map<String, String>[] summary) {
		this.summary = summary;
	}
	public Alert[] getData() {
		return data;
	}
	public void setData(Alert[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Alerts [total=" + total + ", summary=" + Arrays.toString(summary) + ", data=" + Arrays.toString(data)
				+ "]";
	}
	
}
