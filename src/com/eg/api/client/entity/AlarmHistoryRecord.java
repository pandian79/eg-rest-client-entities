package com.eg.api.client.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlarmHistoryRecord {
	String priority;
	String layer;
	//Fixing #22 UnrecognizedPropertyException: Unrecognized field "displayer" in 7.5.4 manager's API response
	String displayer;
	String measure;
	String componentType;
	String componentName;
	String service;
	String test;
	String description;
	@JsonProperty("ZoneName")
	String zoneName;
	String startTime;
	String duration;
	String info;
	Integer repeatCount;
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getLayer() {
		return layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
	}
	public String getDisplayer() {
		return displayer;
	}
	public void setDisplayer(String displayer) {
		this.displayer = displayer;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	public String getComponentType() {
		return componentType;
	}
	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getZoneName() {
		return zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Integer getRepeatCount() {
		return repeatCount;
	}
	public void setRepeatCount(Integer repeatCount) {
		this.repeatCount = repeatCount;
	}
	@Override
	public String toString() {
		return "AlarmHistoryRecord [priority=" + priority + ", layer=" + layer + ", measure=" + measure
				+ ", componentType=" + componentType + ", componentName=" + componentName + ", service=" + service
				+ ", test=" + test + ", description=" + description + ", startTime=" + startTime + ", duration="
				+ duration + ", info=" + info + "]";
	}
	
}
