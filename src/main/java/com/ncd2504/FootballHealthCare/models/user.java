package com.ncd2504.FootballHealthCare.models;

import java.util.Collection;
import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ncd2504.FootballHealthCare.enums.UserRole;

@Document("userInfor")
public class user implements UserDetails {
    @Id
    private String userId;
    private String username;
    private String password;
    private String userImageUrl;
    private Boolean userStatus;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    public user(String userId,
            String username,
            String password,
            String userImageUrl,
            Boolean userStatus,
            UserRole role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userImageUrl = userImageUrl;
        this.userStatus = userStatus;
        this.role = role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UserRole.ADMIN) {
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        }
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserImageUrl() {
        return this.userImageUrl;
    }

    public boolean getUserStatus() {
        return this.userStatus;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}