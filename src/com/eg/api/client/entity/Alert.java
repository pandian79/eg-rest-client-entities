package com.eg.api.client.entity;

import java.util.Objects;

/**
 * The Class Alert. Entity object for eG Alert 
 * @see com.eg.api.client.dao.AlarmsRepository
 */
public class Alert implements Comparable<Alert>{
	String priority;
	String componentType;
	String componentName;
	String description;
	String test;
	String measure;
	String layer;
	String startTime;
	String service;
	String info;
	String alarmID;
	String duration;
	
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getMeasure() {
		return measure;
	}
	public void setMeasure(String measure) {
		this.measure = measure;
	}
	public String getLayer() {
		return layer;
	}
	public void setLayer(String layer) {
		this.layer = layer;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getAlarmID() {
		return alarmID;
	}
	public void setAlarmID(String alarmID) {
		this.alarmID = alarmID;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public int compareTo(Alert o) {
		return o.toString().compareTo(this.toString());
	}
	@Override
	public String toString() {
		return "Alert [priority=" + priority + ", componentType=" + componentType + ", componentName=" + componentName
				+ ", description=" + description + ", test=" + test + ", measure=" + measure + ", layer=" + layer
				+ ", startTime=" + startTime + ", service=" + service + ", info=" + info + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(componentName, componentType, description, info, layer, measure, priority, service,
				startTime, test);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alert other = (Alert) obj;
		return Objects.equals(componentName, other.componentName) && Objects.equals(componentType, other.componentType)
				&& Objects.equals(description, other.description) && Objects.equals(info, other.info)
				&& Objects.equals(layer, other.layer) && Objects.equals(measure, other.measure)
				&& Objects.equals(priority, other.priority) && Objects.equals(service, other.service)
				&& Objects.equals(startTime, other.startTime) && Objects.equals(test, other.test);
	}
	
}
