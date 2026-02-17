package com.eg.api.client.entity;

import java.util.ArrayList;
import java.util.List;

public class LiveMeasureComponent {
	String name;
	List<LiveMeasureTest> tests = new ArrayList();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<LiveMeasureTest> getTests() {
		return tests;
	}
	public void setTests(List<LiveMeasureTest> tests) {
		this.tests = tests;
	}

}
