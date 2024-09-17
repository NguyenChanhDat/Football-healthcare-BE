package com.ncd2504.FootballHealthCare.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("setInfor")
public class set {
    @Id
    private String id;
    private exercise exerciseInfor;
    private float weight;
    private int reps;
    private int restTime;// second

    public set(String id, exercise exerciseInfor, float weight, int reps, int restTime) {
        this.id = id;
        this.exerciseInfor = exerciseInfor;
        this.weight = weight;
        this.reps = reps;
        this.restTime = restTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public exercise getExerciseInfor() {
        return exerciseInfor;
    }

    public void setExerciseInfor(exercise exerciseInfor) {
        this.exerciseInfor = exerciseInfor;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getRestTime() {
        return restTime;
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

}
