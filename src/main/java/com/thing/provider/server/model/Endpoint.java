package com.thing.provider.server.model;

public class Endpoint {
    private String endpointName;
    private String endpointUrl;
    private Boolean isWorking;
    private User user;

    public Endpoint(String endpointName, String endpoint, Boolean isWorking) {
        this.endpointName = endpointName;
        this.endpointUrl = endpoint;
        this.isWorking = isWorking;
    }

    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public Boolean getWorking() {
        return isWorking;
    }

    public void setWorking(Boolean working) {
        isWorking = working;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
