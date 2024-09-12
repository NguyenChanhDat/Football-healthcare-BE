package com.ncd2504.FootballHealthCare.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncd2504.FootballHealthCare.models.exercise;
import com.ncd2504.FootballHealthCare.repositories.ExerciseRepository;

@Service
public class ExerciseService {
    @Autowired
    ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Optional<exercise> getById(String id) {
        return exerciseRepository.findById(id);
    }

    public List<exercise> getAll(){
        return exerciseRepository.findAll();
    }
}
