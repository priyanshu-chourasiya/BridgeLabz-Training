package com.constructor.levelone;

class Circle {
    double radius;

    // Default Constructor
    Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Area: " + c1.area());
        System.out.println("Area: " + c2.area());
    }
}

