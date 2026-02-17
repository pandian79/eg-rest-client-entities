package com.eg.api.client.entity;

import java.util.HashMap;
import java.util.Map;

public class DiagnosisDataRequestBody {

    private String timeline;
    private String componentName;
    private String componentType;
    private String test;
    private String measure;
    private String info;
    private Boolean showDisplayName;
    private String startDate;
    private String endDate;

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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Boolean getShowDisplayName() {
        return showDisplayName;
    }

    public void setShowDisplayName(Boolean showDisplayName) {
        this.showDisplayName = showDisplayName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "DiagnosisDataRequestBody{" +
                "timeline='" + timeline + '\'' +
                ", componentName='" + componentName + '\'' +
                ", componentType='" + componentType + '\'' +
                ", test='" + test + '\'' +
                ", measure='" + measure + '\'' +
                ", info='" + info + '\'' +
                ", showDisplayName=" + showDisplayName +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>();
        if (timeline != null) map.put("timeline", timeline);
        if (componentName != null) map.put("componentName", componentName);
        if (componentType != null) map.put("componentType", componentType);
        if (test != null) map.put("test", test);
        if (measure != null) map.put("measure", measure);
        if (info != null) map.put("info", info);
        if (showDisplayName != null) map.put("showDisplayName", String.valueOf(showDisplayName));
        if (startDate != null) map.put("startDate", startDate);
        if (endDate != null) map.put("endDate", endDate);
        return map;
    }
}