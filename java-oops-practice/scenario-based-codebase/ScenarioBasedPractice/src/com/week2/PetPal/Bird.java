package com.week2.PetPal;

public class Bird extends Pet implements IInteractable {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird says: Tweet Tweet!");
    }

    @Override
    public void feed() {
        decreaseHunger(6);
        increaseMood(3);
        System.out.println("Bird is pecking food.");
    }

    @Override
    public void play() {
        increaseHunger(3);
        increaseMood(6);
        System.out.println("Bird is flying around.");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is resting in its nest.");
    }
}
