package com.ncd2504.FootballHealthCare.models;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "exercise")
public class exercise {
    @Id
    String Id;
    String name;
    String imageUrl;
    @Enumerated(EnumType.STRING)
    String targetMuscle1;
    @Enumerated(EnumType.STRING)
    String targetMuscle2;
    @Enumerated(EnumType.STRING)
    String targetMuscle3;

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.Id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getTargetMuscle1() {
        return this.targetMuscle1;
    }

    public String getTargetMuscle2() {
        return this.targetMuscle2;
    }

    public String getTargetMuscle3() {
        return this.targetMuscle3;
    }
}
