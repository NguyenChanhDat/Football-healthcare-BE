package com.ncd2504.FootballHealthCare.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("setInfor")
public class set {
    @Id
    private String id;
    private String exerciseName;
    private float weight;
    private int reps;
    private int restTime;// second

    public set(String id,
            String exerciseName,
            float weight,
            int reps,
            int restTime) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.weight = weight;
        this.reps = reps;
        this.restTime = restTime;
    }

    public String getId() {
        return this.id;
    }

    public String getExerciseName() {
        return this.exerciseName;
    }

    public float getWeight() {
        return this.weight;
    }
    public int getRep(){
        return this.reps;
    }
    public int getRestTime() {
        return this.restTime;
    }

}
