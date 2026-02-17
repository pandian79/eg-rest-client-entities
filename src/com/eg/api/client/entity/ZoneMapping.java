package com.eg.api.client.entity;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class ZoneMapping<T, U> extends Hashtable<String, ZoneEntities>{
	private static final long serialVersionUID = 1L;
	public ZoneMapping() {
		super();
	}
	
	public ZoneMapping(List<ZoneMappingRaw> rawList) {
		for (ZoneMappingRaw raw:rawList) {
			String zone=raw.getZone();
			List<String> groups = raw.getGroups();
			List<String> services = raw.getServices();
			List<String> segments = raw.getSegments();
			List<String> subZones = raw.getSubZones();
			List<String> componentsRaw = raw.getComponents();
			List<EgComponent> componentList = new ArrayList<EgComponent>();
			if (componentsRaw!=null && !componentsRaw.isEmpty()) {
				for (String comp:componentsRaw) {
					String[] split = comp.split(":");
					EgComponent c = new EgComponent();
					if (split.length==2) {
						//"OFFICE-365_ymr:Microsoft Yammer"
						c.setHostname(split[0]);
						c.setType(split[1]);
					} else if (split.length==3) {
						//apac_manager:443:External Web
						c.setHostname(split[0]);
						c.setPort(split[1]);
						c.setType(split[2]);
					} else if (split.length==4) {
						//apac_manager:443:External Web
						c.setHostname(split[0]);
						c.setPort(split[1]);
						c.setPort(split[2]);
						c.setType(split[3]);
					}else {
						throw new IllegalArgumentException("Invalid component format "+comp);
					}
					componentList.add(c);
				}
			}
			ZoneEntities ze = new ZoneEntities();
			ze.setComponents(componentList);
			ze.setGroups(groups);
			ze.setSegments(segments);
			ze.setServices(services);
			ze.setSubZones(subZones);
			this.put(zone, ze);
		}
		
	}
}
