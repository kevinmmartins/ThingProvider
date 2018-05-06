package com.thing.provider.server.ThingProviderServer.model;

import java.time.LocalDateTime;

public class User {
    private String fullName;
    private String password;
    private Boolean isActive;
    private LocalDateTime lastActive;

    public User(){

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

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
