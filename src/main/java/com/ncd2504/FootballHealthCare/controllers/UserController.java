package com.ncd2504.FootballHealthCare.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncd2504.FootballHealthCare.models.user;
import com.ncd2504.FootballHealthCare.services.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping("getUserById")
    public Optional<user> getById(@Argument("userId") String userId) {
        return userService.getById(userId);
    }
}
