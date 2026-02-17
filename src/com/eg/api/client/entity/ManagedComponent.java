package com.eg.api.client.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ManagedComponent {

    @JsonProperty("componentType")
    private String componentType;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("componentName")
    private String componentName;

    @JsonProperty("port")
    private String port;

    @JsonProperty("externalAgent")
    private String externalAgent;

    @JsonProperty("internalAgent")
    private String internalAgent;

    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getPort() {
        return port!=null?port:"NULL";
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getExternalAgent() {
        return externalAgent;
    }

    public void setExternalAgent(String externalAgent) {
        this.externalAgent = externalAgent;
    }

    public String getInternalAgent() {
        return internalAgent;
    }

    public void setInternalAgent(String internalAgent) {
        this.internalAgent = internalAgent;
    }

    @Override
    public String toString() {
        return "ShowComponent{" +
                "componentType='" + componentType + '\'' +
                ", ip='" + ip + '\'' +
                ", componentName='" + componentName + '\'' +
                ", port='" + port + '\'' +
                ", externalAgent='" + externalAgent + '\'' +
                ", internalAgent='" + internalAgent + '\'' +
                '}';
    }
}
