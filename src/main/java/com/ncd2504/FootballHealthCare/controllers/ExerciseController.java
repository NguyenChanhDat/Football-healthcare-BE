package com.ncd2504.FootballHealthCare.controllers;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncd2504.FootballHealthCare.models.exercise;
import com.ncd2504.FootballHealthCare.services.ExerciseService;

@RestController
public class ExerciseController {
    @Autowired
    ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @QueryMapping("getAllExercises")
    public List<exercise> getAll() {
        return exerciseService.getAll();
    }

    @QueryMapping("getExerciseById")
    @SchemaMapping("")
    public Optional<exercise> getById(@Argument("exerciseId") String exerciseId) {
        return exerciseService.getById(exerciseId);
    }
}
