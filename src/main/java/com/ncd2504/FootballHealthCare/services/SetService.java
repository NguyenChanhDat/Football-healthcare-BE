package com.ncd2504.FootballHealthCare.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncd2504.FootballHealthCare.models.set;
import com.ncd2504.FootballHealthCare.repositories.SetRepository;

@Service
public class SetService {
    @Autowired
    private SetRepository setRepository;

    public SetService(SetRepository setRepository) {
        this.setRepository = setRepository;
    }

    public Optional<set> getById(String id) {
        return setRepository.findById(id);
    }
}
