package com.ncd2504.FootballHealthCare.controllers;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.ncd2504.FootballHealthCare.models.exercise;
import com.ncd2504.FootballHealthCare.repositories.ExerciseRepository;

@RestController
public class ExerciseController {
    @Autowired
    ExerciseRepository exerciseRepository;

    public ExerciseController(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @QueryMapping("getAllExercises")
    public List<exercise> getAll() {
        return exerciseRepository.findAll();
    }

    @QueryMapping("getExerciseById")
    // @RequestMapping(value = "/{exerciseId}")
    public Optional<exercise> getById(@Argument("exerciseId") String exerciseId) {
        System.out.println("INNNNNN");
        System.out.println(exerciseId);
        System.out.println(exerciseRepository.findById(exerciseId));
        return exerciseRepository.findById(exerciseId);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void postExercise(@RequestBody exercise postExercise) {
        exerciseRepository.save(postExercise);
    }
}
