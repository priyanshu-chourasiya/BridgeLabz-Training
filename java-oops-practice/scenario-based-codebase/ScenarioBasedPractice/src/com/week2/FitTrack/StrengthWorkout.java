package com.week2.FitTrack;

public class StrengthWorkout extends Workout implements ITrackable {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 5.0; 
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println("Strength workout started...");
    }

    @Override
    public void stopWorkout() {
        calculateCalories();
        System.out.println("Strength workout stopped.");
        logWorkout();
    }
}
