package com.eg.api.client.entity;

public class UserInfo {
	String id;
	String type;
	String mailId;
	String alarmPref;
	String alarmMode;
	String validTill;
	String regDate;
	String servType;
	String caEnabled;
	String reptTimeline;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getAlarmPref() {
		return alarmPref;
	}
	public void setAlarmPref(String alarmPref) {
		this.alarmPref = alarmPref;
	}
	public String getAlarmMode() {
		return alarmMode;
	}
	public void setAlarmMode(String alarmMode) {
		this.alarmMode = alarmMode;
	}
	public String getValidTill() {
		return validTill;
	}
	public void setValidTill(String validTill) {
		this.validTill = validTill;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getServType() {
		return servType;
	}
	public void setServType(String servType) {
		this.servType = servType;
	}
	public String getCaEnabled() {
		return caEnabled;
	}
	public void setCaEnabled(String caEnabled) {
		this.caEnabled = caEnabled;
	}
	public String getReptTimeline() {
		return reptTimeline;
	}
	public void setReptTimeline(String reptTimeline) {
		this.reptTimeline = reptTimeline;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", type=" + type + ", mailId=" + mailId + ", alarmPref=" + alarmPref
				+ ", alarmMode=" + alarmMode + ", validTill=" + validTill + ", regDate=" + regDate + ", servType="
				+ servType + ", caEnabled=" + caEnabled + ", reptTimeline=" + reptTimeline + "]";
	}
}
