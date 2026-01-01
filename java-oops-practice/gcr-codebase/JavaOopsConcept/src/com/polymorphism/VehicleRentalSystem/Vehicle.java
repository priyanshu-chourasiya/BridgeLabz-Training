package com.polymorphism.VehicleRentalSystem;

abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    abstract double calculateRentalCost(int days);

    void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type);
    }
}
