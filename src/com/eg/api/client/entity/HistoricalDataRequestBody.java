package com.eg.api.client.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoricalDataRequestBody {

    private String timeline;
    private String componentName;
    private String componentType;
    private String test;
    private String measure;
    private Boolean showDisplayName;

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

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

    public Boolean getShowDisplayName() {
        return showDisplayName;
    }

    public void setShowDisplayName(Boolean showDisplayName) {
        this.showDisplayName = showDisplayName;
    }

    public List<String> validate() {
        List<String> errors = new ArrayList<>();
        if (isNullOrEmpty(timeline)) errors.add("timeline is required");
        if (isNullOrEmpty(componentName)) errors.add("componentName is required");
        if (isNullOrEmpty(componentType)) errors.add("componentType is required");
        if (isNullOrEmpty(test)) errors.add("test is required");
        if (isNullOrEmpty(measure)) errors.add("measure is required");
        return errors;
    }

    private boolean isNullOrEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    @Override
    public String toString() {
        return "HistoricalDataRequestBody{" +
                "timeline='" + timeline + '\'' +
                ", componentName='" + componentName + '\'' +
                ", componentType='" + componentType + '\'' +
                ", test='" + test + '\'' +
                ", measure='" + measure + '\'' +
                ", showDisplayName=" + showDisplayName +
                '}';
    }

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<>();
		if (timeline != null) map.put("timeline", timeline);
		if (componentName != null) map.put("componentName", componentName);
		if (componentType != null) map.put("componentType", componentType);
		if (test != null) map.put("test", test);
		if (measure != null) map.put("measure", measure);
		if (showDisplayName != null) map.put("showDisplayName", String.valueOf(showDisplayName));
		return map;
	}
}