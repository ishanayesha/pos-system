package com.ruhunu.pos.dto;

import org.springframework.hateoas.ResourceSupport;

/**
 * Health DTO class
 */
public class HealthDTO extends ResourceSupport {

    private String appName;
    private String version;
    private String status;

    public HealthDTO(String appName, String version, String status) {
        this.appName = appName;
        this.version = version;
        this.status = status;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
