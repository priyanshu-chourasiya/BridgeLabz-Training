package com.week2.PetPal;

public class Cat extends Pet implements IInteractable {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow!");
    }

    @Override
    public void feed() {
        decreaseHunger(8);
        increaseMood(4);
        System.out.println("Cat is eating quietly.");
    }

    @Override
    public void play() {
        increaseHunger(4);
        increaseMood(8);
        System.out.println("Cat is playing with yarn.");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping lazily.");
    }
}
