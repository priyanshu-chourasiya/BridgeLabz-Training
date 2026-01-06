package com.week2.PetPal;

public class Dog extends Pet implements IInteractable {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }

    @Override
    public void feed() {
        decreaseHunger(10);
        increaseMood(5);
        System.out.println("Dog is eating happily.");
    }

    @Override
    public void play() {
        increaseHunger(5);
        increaseMood(10);
        System.out.println("Dog is playing fetch!");
    }

    @Override
    public void sleep() {
        decreaseHunger(5);
        System.out.println("Dog is sleeping peacefully.");
    }
}
