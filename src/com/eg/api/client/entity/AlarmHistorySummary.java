package com.eg.api.client.entity;

public class AlarmHistorySummary {
	Integer total;
	Integer critical;
	Integer major;
	Integer minor;
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getCritical() {
		return critical;
	}
	public void setCritical(Integer critical) {
		this.critical = critical;
	}
	public Integer getMajor() {
		return major;
	}
	public void setMajor(Integer major) {
		this.major = major;
	}
	public Integer getMinor() {
		return minor;
	}
	public void setMinor(Integer minor) {
		this.minor = minor;
	}
	@Override
	public String toString() {
		return "AlarmHistorySummary [total=" + total + ", critical=" + critical + ", major=" + major + ", minor="
				+ minor + "]";
	}
}
