package com.ncd2504.FootballHealthCare.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncd2504.FootballHealthCare.models.user;
import com.ncd2504.FootballHealthCare.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<user> getById(String id) {
        return userRepository.findById(id);
    }
}
