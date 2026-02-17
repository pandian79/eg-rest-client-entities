package com.eg.api.client.entity;

import java.util.List;

public class ZoneEntities {
	private List<String> groups;
	private List<String> services;
	private List<String> segments;
	private List<EgComponent> components;
	private List<String> subZones;
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
	public List<EgComponent> getComponents() {
		return components;
	}
	public void setComponents(List<EgComponent> components) {
		this.components = components;
	}
	public List<String> getSubZones() {
		return subZones;
	}
	public void setSubZones(List<String> subZones) {
		this.subZones = subZones;
	}

}
