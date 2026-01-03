/*
 * "CabbyGo – A Ride-Hailing App in the Making"
Story: You’ve joined a startup building CabbyGo, a ride-hailing app. You're tasked with building
the backend logic for managing vehicles, drivers, and ride booking.
Requirements:
● Vehicle (class): fields like vehicleNumber, capacity, type.
● Driver (class): fields like name, licenseNumber, rating.
● Constructors to initialize vehicles and drivers.
● An IRideService interface with methods like bookRide() and endRide().
● Use encapsulation to hide sensitive data like location, fare.
● Implement polymorphism with different vehicle types like Mini, Sedan, SUV (all extend
Vehicle).

● Use operators to calculate fare: baseFare + distance * rate.



● Apply access modifiers carefully: private for rating and fare, public methods to
read data.
 */

package com.week1.CabbyGo;

public class Main {
    public static void main(String[] args) {

        // Mini ride
        IRideService mini = new Mini(101, 4, "Mini", 10);
        mini.bookRide(12);          // distance = 12
        mini.CalculateRate(500);    // basefare for Mini
        mini.endRide();

        System.out.println("----------------");

        // Sedan ride
        IRideService sedan = new Sedan(102, 4, "Sedan", 15);
        sedan.bookRide(10);         // distance = 10
        sedan.CalculateRate(1000);  // basefare for Sedan
        sedan.endRide();

        System.out.println("----------------");

        // SUV ride
        IRideService suv = new SUV(103, 6, "SUV", 20);
        suv.bookRide(8);            // distance = 8
        suv.CalculateRate(5000);    // basefare for SUV
        suv.endRide();
    }
}

