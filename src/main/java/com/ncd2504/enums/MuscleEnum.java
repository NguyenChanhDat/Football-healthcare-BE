package com.ncd2504.enums;

public enum MuscleEnum {
    CHEST("chest"),
    SHOULDER("shoulder"),
    TRICEPS("triceps"),
    BICEPS("biceps"),
    QUADS("quads"),
    HAMSTRING("hamstring"),
    CALVES("calves");

    private String muscleTarget;

    private MuscleEnum(String muscleTarget) {
        this.muscleTarget = muscleTarget;
    }

    public String getMuscle() {
        return this.muscleTarget;
    }
}
