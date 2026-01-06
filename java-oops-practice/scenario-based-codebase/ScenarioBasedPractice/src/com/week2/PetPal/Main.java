/*
 * "PetPal – Virtual Pet Care App"
Story: You’re creating PetPal, an app that allows users to adopt and care for virtual pets like
dogs, cats, and birds.
Requirements:
● Pet base class: name, type, age.
● Derived classes: Dog, Cat, Bird (use inheritance).
● IInteractable interface with methods like feed(), play(), sleep().
● Encapsulation of hunger and mood levels.
● Use constructors to assign random default values or user-specified pets.
● Operators to increase/decrease energy, hunger based on interactions.
● Polymorphism: makeSound() behaves differently for each pet.
● Access modifiers ensure internal mood status is only modifiable through methods.

 */

package com.week2.PetPal;

public class Main {

    public static void main(String[] args) {

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("abc", 2);
        Pet bird = new Bird("tomm", 1);

        IInteractable d = (IInteractable) dog;
        IInteractable c = (IInteractable) cat;
        IInteractable b = (IInteractable) bird;

        dog.makeSound();
        d.feed();
        d.play();
        dog.showStatus();

        System.out.println("----------------");

        cat.makeSound();
        c.play();
        c.sleep();
        cat.showStatus();

        System.out.println("----------------");

        bird.makeSound();
        b.feed();
        b.play();
        bird.showStatus();
    }
}

