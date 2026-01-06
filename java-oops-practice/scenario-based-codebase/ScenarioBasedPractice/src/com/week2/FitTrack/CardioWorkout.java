package com.week2.FitTrack;

public class CardioWorkout extends Workout implements ITrackable {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 8.0; 
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println("Cardio workout started...");
    }

    @Override
    public void stopWorkout() {
        calculateCalories();
        System.out.println("Cardio workout stopped.");
        logWorkout();
    }
}
