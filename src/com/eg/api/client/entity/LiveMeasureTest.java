package com.eg.api.client.entity;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class LiveMeasureTest {
	String name;
	String priority;
	String lastMeasurementTime;
	
	/** The measurements map. key will be descriptor name, value will be metrics array. for no descriptor test key will be -*/
	List<LiveMeasureDescriptor> descriptorList = new ArrayList<LiveMeasureDescriptor>();
	
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
	public List<LiveMeasureDescriptor> getDescriptorList() {
		return descriptorList;
	}
	public void setDescriptorList(List<LiveMeasureDescriptor> descriptorList) {
		this.descriptorList = descriptorList;
	}
	public LiveMeasureDescriptor getLiveMeasureDescriptor(String descriptor) {
		for (LiveMeasureDescriptor d:this.descriptorList) {
			if (d.getName().equals(descriptor))
				return d;
		}
		return null;
	}
}
