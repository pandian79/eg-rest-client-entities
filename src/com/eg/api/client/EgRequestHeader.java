package com.eg.api.client;

import java.util.Map;
/**
 * Class to hold request header information for EG API calls.
 * @author Murugapandian
 * @since 2024-06-01
 */
public class EgRequestHeader {
	String managerUrl;
	String user;
	String pwd;
	String accessId;
	/**
	 * Constructor to initialize EgRequestHeader from a Map.
	 * The map should contain
	 * "managerurl", "user", "pwd", and optionally "accessId" keys.
	 * @param map A Map containing the header information.
	 */
	public EgRequestHeader(Map<String, String> map) {
		super();
		this.managerUrl = map.get("managerurl");
		this.user = map.get("user");
		this.pwd = map.get("pwd");
		this.accessId = map.get("accessId");
		
	}
	/** Default constructor.
	 * This constructor is needed for frameworks that require a no-argument constructor.
	 */
	public EgRequestHeader() {
		super();
	}
	/**
	 * Constructor to initialize EgRequestHeader with all fields.
	 * @param managerUrl The URL of the EG Manager.
	 * @param user The username for authentication.
	 * @param pwd The password for authentication.
	 * @param accessId The access ID for API calls (optional).
	 */
	public EgRequestHeader(String managerUrl, String user, String pwd, String accessId) {
		super();
		this.managerUrl=managerUrl;
		this.user = user;
		this.pwd = pwd;
		this.accessId = accessId;
	}
	/**
	 * Constructor to initialize EgRequestHeader without accessId.
	 * @param managerUrl2 The URL of the EG Manager.
	 * @param user2 The username for authentication.
	 * @param pwd2 The password for authentication.
	 */
	public EgRequestHeader(String managerUrl2, String user2, String pwd2) {
		super();
		this.managerUrl=managerUrl2;
		this.user = user2;
		this.pwd = pwd2;
	}
	public String getManagerUrl() {
		return managerUrl;
	}
	public void setManagerUrl(String managerUrl) {
		this.managerUrl = managerUrl;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAccessId() {
		return accessId;
	}
	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}
}
