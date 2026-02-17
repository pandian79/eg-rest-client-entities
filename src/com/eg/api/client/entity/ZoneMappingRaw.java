package com.eg.api.client.entity;

import java.io.Serializable;
import java.util.List;

public class ZoneMappingRaw implements Serializable {
	private static final long serialVersionUID = 1L;
	private String zone;
	private List<String> groups;
	private List<String> services;
	private List<String> segments;
	private List<String> components;
	private List<String> subZones;
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public List<String> getGroups() {
		return groups;
	}
	public void setGroups(List<String> groups) {
		this.groups = groups;
	}
	public List<String> getServices() {
		return services;
	}
	public void setServices(List<String> services) {
		this.services = services;
	}
	public List<String> getSegments() {
		return segments;
	}
	public void setSegments(List<String> segments) {
		this.segments = segments;
	}
	public List<String> getComponents() {
		return components;
	}
	public void setComponents(List<String> components) {
		this.components = components;
	}
	public List<String> getSubZones() {
		return subZones;
	}
	public void setSubZones(List<String> subZones) {
		this.subZones = subZones;
	}
	@Override
	public String toString() {
		return "ZoneMappingRaw [zone=" + zone + ", groups=" + groups + ", services=" + services + ", segments="
				+ segments + ", components=" + components + ", subZones=" + subZones + "]";
	}
	

}
