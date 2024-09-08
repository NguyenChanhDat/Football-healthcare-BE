package com.ncd2504.FootballHealthCare.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("userInfor")
public class user {
    @Id
    private String userId;
    private String username;
    private String password;
    private String userImageUrl;
    private Boolean userStatus;

    public user(String userId,
            String username,
            String password,
            String userImageUrl,
            Boolean userStatus) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userImageUrl = userImageUrl;
        this.userStatus = userStatus;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserImageUrl() {
        return this.userImageUrl;
    }

    public Boolean getUserStatus() {
        return this.userStatus;
    }
}
