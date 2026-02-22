package com.eg.api.client.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Entity class for the request body of /api/eg/analytics/getThresholdData
 */
public class ThresholdDataRequestBody {

    private String componentName;
    private String componentType;
    private String test;
    private String measure;
    private String info;

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "ThresholdDataRequestBody{" +
				"componentName='" + componentName + '\'' +
				", componentType='" + componentType + '\'' +
				", test='" + test + '\'' +
				", measure='" + measure + '\'' +
				", info='" + info + '\'' +
				'}';
    }

    public Map<String, String> toMap() {
    			Map<String, String> map = new HashMap<>();
		if (componentName != null) map.put("componentName", componentName);
		if (componentType != null) map.put("componentType", componentType);
		if (test != null) map.put("test", test);
		if (measure != null) map.put("measure", measure);
		if (info != null) map.put("info", info);
		map.put("showData", "Threshold");
		return map;
    }
}