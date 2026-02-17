package com.eg.api.client.entity;
/**
 * The Class LiveMeasureDetail.
 * This class represents the details of a live measure, including its unit, value, and priority.
 * It is used in the context of live monitoring and analytics in eG Manager.
 *  {
              "unit": "Number",
              "priority": "normal",
              "value": "0"
            }
 * @author Murugapandian
 * @since 2026-02-14
 */
public class LiveMeasureDetail {
	private String unit;
	private String value;
	private String priority;
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
}
