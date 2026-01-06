package com.week2.FitTrack;

public class Workout {

    protected String type;
    protected int duration;
    protected double caloriesBurned;

    protected Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    
    public double calculateCalories() {
        return caloriesBurned;
    }

    protected void logWorkout() {
        System.out.println("Workout Type: " + type);
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Calories Burned: " + caloriesBurned);
    }
}
