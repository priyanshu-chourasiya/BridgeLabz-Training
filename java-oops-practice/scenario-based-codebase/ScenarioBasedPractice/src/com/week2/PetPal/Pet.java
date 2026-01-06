package com.week2.PetPal;

import java.util.Random;

public class Pet {

    protected String name;
    protected String type;
    protected int age;

    
    private int hungerLevel;
    private int moodLevel;

   
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random r = new Random();
        this.hungerLevel = r.nextInt(50) + 1;
        this.moodLevel = r.nextInt(50) + 1;
    }

   
    protected void increaseHunger(int value) {
        hungerLevel += value;
    }

    protected void decreaseHunger(int value) {
        hungerLevel -= value;
    }

    protected void increaseMood(int value) {
        moodLevel += value;
    }

    protected void decreaseMood(int value) {
        moodLevel -= value;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    void makeSound() {
        System.out.println("Pet makes a sound");
    }

    protected void showStatus() {
        System.out.println("Hunger Level: " + hungerLevel);
        System.out.println("Mood Level: " + moodLevel);
    }
}
