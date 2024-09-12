package com.ncd2504.FootballHealthCare.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("userInfor")
public class user {
    @Id
    private String id;
    private String username;
    private String password;
    private String imageUrl;
    private Boolean status;

    public user(String id,
            String username,
            String password,
            String imageUrl,
            Boolean status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.imageUrl = imageUrl;
        this.status = status;
    }

    public String getId() {
        return this.id;
    }

    public String getUserName() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public Boolean getStatus() {
        return this.status;
    }
}