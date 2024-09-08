package com.ncd2504.FootballHealthCare.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ncd2504.FootballHealthCare.models.user;
import com.ncd2504.FootballHealthCare.repositories.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "")
    public List<user> getUser() {
        System.out.println("INSIDE GETUSERRRRRRRR");
        return userRepository.findAll();
    }

    @QueryMapping("getById")
    @RequestMapping(value = "/{userId}")
    public Optional<user> getById(@PathVariable @Argument String userId) {
        System.out.println("INSIDE GET BY ID");
        System.out.println(userId);
        System.out.println(userRepository.findById(userId));
        return userRepository.findById(userId);
    }
}
