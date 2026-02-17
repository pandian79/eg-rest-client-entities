package com.eg.api.client.entity;
import java.util.List;

public class EnabledDisabledTests {

    private List<String> enabledTests;
    private List<String> disabledTests;

    public List<String> getEnabledTests() {
        return enabledTests;
    }

    public void setEnabledTests(List<String> enabledTests) {
        this.enabledTests = enabledTests;
    }

    public List<String> getDisabledTests() {
        return disabledTests;
    }

    public void setDisabledTests(List<String> disabledTests) {
        this.disabledTests = disabledTests;
    }

    @Override
    public String toString() {
        return "TestConfig{" +
                "enabledTests=" + enabledTests +
                ", disabledTests=" + disabledTests +
                '}';
    }
}
