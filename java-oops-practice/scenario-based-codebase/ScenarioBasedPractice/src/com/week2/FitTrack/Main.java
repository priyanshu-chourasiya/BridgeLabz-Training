/*
 *  "FitTrack – Your Personal Fitness Tracker"
Story: You’ve been hired to develop FitTrack, a fitness tracking app that monitors users'
workouts, calories, and daily progress.
Requirements:
● UserProfile class with fields like name, age, weight, goal.
● Workout class to track type, duration, caloriesBurned.
● Constructors to allow user creation with default or custom goals.
● ITrackable interface with startWorkout() and stopWorkout() methods.
● Use encapsulation to protect private health data (e.g., weight).
● Operators to compute calorie targets and progress (dailyTarget -
caloriesBurned).
● Inheritance: CardioWorkout, StrengthWorkout extend Workout.
● Polymorphism: calculateCalories() differs by workout type.
● Access modifiers to restrict internal workout logs from being exposed directly.
 */
package com.week2.FitTrack;

public class Main {

    public static void main(String[] args) {

        UserProfile user = new UserProfile("Priyanshu", 22, 70, "Lose Weight");
        user.displayProfile();

        int dailyTarget = 500;

        Workout cardio = new CardioWorkout(30);
        ITrackable track1 = (ITrackable) cardio;

        track1.startWorkout();
        track1.stopWorkout();

        double progress = dailyTarget - cardio.calculateCalories();
        System.out.println("Remaining calories to burn today: " + progress);

        System.out.println("*************");

        Workout strength = new StrengthWorkout(40);
        ITrackable track2 = (ITrackable) strength;

        track2.startWorkout();
        track2.stopWorkout();
    }
}

