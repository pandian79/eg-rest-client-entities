package com.eg.api.client.entity;

/**
 * The Class Measurement. One of the entity objects to flatten /api/eg/analytics/getLiveMeasure
 */
public class LiveMeasureMeasurement {

/** The measure name. */
String measureName;

/** The unit. */
String unit;

/** The priority. */
String priority;

String value;

/**
 * Gets the measure name.
 *
 * @return the measure name
 */
public String getMeasureName() {
	return measureName;
}

/**
 * Sets the measure name.
 *
 * @param measureName the new measure name
 */
public void setMeasureName(String measureName) {
	this.measureName = measureName;
}

/**
 * Gets the unit.
 *
 * @return the unit
 */
public String getUnit() {
	return unit;
}

/**
 * Sets the unit.
 *
 * @param unit the new unit
 */
public void setUnit(String unit) {
	this.unit = unit;
}

/**
 * Gets the priority.
 *
 * @return the priority
 */
public String getPriority() {
	return priority;
}

/**
 * Sets the priority.
 *
 * @param priority the new priority
 */
public void setPriority(String priority) {
	this.priority = priority;
}

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}
}
