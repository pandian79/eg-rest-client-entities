package com.eg.api.client.entity;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class LiveMeasureDescriptor {
	String name;
	String priority;
	String lastMeasurementTime;
	List<LiveMeasureMeasurement> measurementsList = new ArrayList<LiveMeasureMeasurement>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getLastMeasurementTime() {
		return lastMeasurementTime;
	}
	public void setLastMeasurementTime(String lastMeasurementTime) {
		this.lastMeasurementTime = lastMeasurementTime;
	}
	public List<LiveMeasureMeasurement> getMeasurementsList() {
		return measurementsList;
	}
	public void setMeasurementsList(List<LiveMeasureMeasurement> measurementsList) {
		this.measurementsList = measurementsList;
	}
	

}
