package com.thing.provider.server.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class User {
    private String fullName;
    private String password;
    private Boolean isActive;
    private LocalDateTime lastActive;
    private Set<Endpoint> endpointList =new HashSet<>();

    public User() {

    }

    public User(String fullName, String password, Boolean isActive, LocalDateTime lastActive) {
        this.fullName = fullName;
        this.password = password;
        this.isActive = isActive;
        this.lastActive = lastActive;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDateTime getLastActive() {
        return lastActive;
    }

    public void setLastActive(LocalDateTime lastActive) {
        this.lastActive = lastActive;
    }

    public Set<Endpoint> getEndpointList() {
        return endpointList;
    }

    public void setEndpointList(Set<Endpoint> endpointList) {
        this.endpointList = endpointList;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
