package com.week2.FitTrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight;  
    private String goal;

    // Default constructor
    public UserProfile() {
        this.goal = "Maintain Fitness";
    }

    // Parameterized constructor
    public UserProfile(String name, int age, double weight, String goal) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
    }

    // Encapsulation: getter & setter for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public String getGoal() {
        return goal;
    }

    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Goal: " + goal);
    }
}
