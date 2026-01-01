package com.polymorphism.VehicleRentalSystem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR-POL-01"));
        vehicles.add(new Bike("BIKE201", 500, "BIKE-POL-02"));
        vehicles.add(new Truck("TRK301", 3000, "TRK-POL-03"));

        int days = 3;

        for (Vehicle v : vehicles) {

            v.displayDetails();

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                insuranceCost = ((Insurable) v).calculateInsurance();
            }

            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("----------------------------");
        }
    }
}
