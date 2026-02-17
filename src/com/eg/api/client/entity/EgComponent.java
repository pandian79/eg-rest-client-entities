package com.eg.api.client.entity;

import com.eg.api.client.constants.Constants;

/**
 * Entity class for Component
 * @author Murugapandian
 * @since 7.1.8
 *
 */
public class EgComponent implements Comparable<EgComponent>{
	protected String type;
	protected String ip;
	protected String hostname;
	protected String port;
	protected String sid;
	protected String mtsEnabled;
	protected String isPassive;
	protected String agentLess;
	protected String internalAgentAssignment;
	protected String internalAgent;
	protected String os;
	protected String mode;
	protected String encryptType;
	protected String keyFileName;
	protected String remotePort;
	protected String remoteUser;
	protected String remotePwd;
	protected String remoteAgent;
	protected String externalAgents;
	protected String asset;
	protected String location;
	protected String reportingManager;
	protected String zone;
	String group;
	
	public EgComponent() {
		super();
	}
	/**
	 * @param line Microsoft SQL,abc,192.168.1.10,1433
	 */
	public EgComponent(String line) {
		String[] tokens = line.split(Constants.COMMA);
		this.type=tokens[0];
		this.ip=tokens[1];
		this.hostname=tokens[2];
		try {
			Integer.parseInt(tokens[3]);
			this.port=tokens[3];
		} catch (NumberFormatException e) {
			//hiphen or null received. ignore
		}
	}
	public EgComponent(String type, String hostname, String port) {
		this.type = type;
		this.hostname = hostname;
		this.port = port;
	}
	public EgComponent(String type, String hostname, String port, String sid) {
		this.type = type;
		this.hostname = hostname;
		this.port = port;
		this.sid = sid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		try {
			Integer.parseInt(port);
			this.port=port;
		} catch (NumberFormatException e) {
			//hiphen or null received. ignore
		}
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getMtsEnabled() {
		return mtsEnabled;
	}
	public void setMtsEnabled(String mtsEnabled) {
		this.mtsEnabled = mtsEnabled;
	}
	public String getIsPassive() {
		return isPassive;
	}
	public void setIsPassive(String isPassive) {
		this.isPassive = isPassive;
	}
	public String getAgentLess() {
		return agentLess;
	}
	public void setAgentLess(String agentLess) {
		this.agentLess = agentLess;
	}
	public String getInternalAgentAssignment() {
		return internalAgentAssignment;
	}
	public void setInternalAgentAssignment(String internalAgentAssignment) {
		this.internalAgentAssignment = internalAgentAssignment;
	}
	public String getInternalAgent() {
		return internalAgent;
	}
	public void setInternalAgent(String internalAgent) {
		this.internalAgent = internalAgent;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getEncryptType() {
		return encryptType;
	}
	public void setEncryptType(String encryptType) {
		this.encryptType = encryptType;
	}
	public String getKeyFileName() {
		return keyFileName;
	}
	public void setKeyFileName(String keyFileName) {
		this.keyFileName = keyFileName;
	}
	public String getRemotePort() {
		return remotePort;
	}
	public void setRemotePort(String remotePort) {
		this.remotePort = remotePort;
	}
	public String getRemoteUser() {
		return remoteUser;
	}
	public void setRemoteUser(String remoteUser) {
		this.remoteUser = remoteUser;
	}
	public String getRemotePwd() {
		return remotePwd;
	}
	public void setRemotePwd(String remotePwd) {
		this.remotePwd = remotePwd;
	}
	public String getRemoteAgent() {
		return remoteAgent;
	}
	public void setRemoteAgent(String remoteAgent) {
		this.remoteAgent = remoteAgent;
	}
	public String getExternalAgents() {
		return externalAgents;
	}
	public void setExternalAgents(String externalAgents) {
		this.externalAgents = externalAgents;
	}
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setHeader(String[] header) {
		throw new RuntimeException("this operation not supported");
	}
	public String getReportingManager() {
		return reportingManager;
	}
	public void setReportingManager(String reportingManager) {
		this.reportingManager = reportingManager;
	}
	
	@Override
	public String toString() {
		return "Component ["+this.getComponentNameInEgFormat()+"]";
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	/**
	 * This returns the component name in type:name:port format
	 * 
	 */
	public String getComponentNameInEgFormat() {
		return this.port==null?
				this.type+":"+this.hostname+":NULL"
				:this.type+":"+this.hostname+":"+this.port;
	}
	@Override
	public int compareTo(EgComponent arg0) {
		int compareToIgnoreCase = arg0.getComponentNameInEgFormat().compareToIgnoreCase(this.getComponentNameInEgFormat());
		return compareToIgnoreCase;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		String componentNameInEgFormat = this.getComponentNameInEgFormat();
		result = prime * result + ((componentNameInEgFormat == null) ? 0 : componentNameInEgFormat.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		EgComponent other = (EgComponent) obj;
		String componentNameInEgFormat = this.getComponentNameInEgFormat();
		
		if (componentNameInEgFormat == null) {
			if (other.getComponentNameInEgFormat() != null) {
				return false;
			}
		} else if (!componentNameInEgFormat.equals(other.getComponentNameInEgFormat())) {
			return false;
		}
		return true;
	}
	
	

}
