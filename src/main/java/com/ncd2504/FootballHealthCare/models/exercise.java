package com.ncd2504.FootballHealthCare.models;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.ncd2504.FootballHealthCare.enums.MuscleEnum;

@Document("exerciseInfor")
public class exercise {
    @Id
    private String id;
    private String name;
    private String imageUrl;
    // @Enumerated(EnumType.STRING)
    // private MuscleEnum targetMuscle1;
    // @Enumerated(EnumType.STRING)
    // private MuscleEnum targetMuscle2;
    // @Enumerated(EnumType.STRING)
    // private MuscleEnum targetMuscle3;

    public exercise(String id,
            String name,
            String imageUrl) {
        // MuscleEnum targetMuscle1, MuscleEnum targetMuscle2, MuscleEnum targetMuscle3)
        // {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        // this.targetMuscle1 = targetMuscle1;
        // this.targetMuscle2 = targetMuscle2;
        // this.targetMuscle3 = targetMuscle3;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    // public MuscleEnum getTargetMuscle1() {
    // return this.targetMuscle1;
    // }

    // public MuscleEnum getTargetMuscle2() {
    // return this.targetMuscle2;
    // }

    // public MuscleEnum getTargetMuscle3() {
    // return this.targetMuscle3;
    // }
}
