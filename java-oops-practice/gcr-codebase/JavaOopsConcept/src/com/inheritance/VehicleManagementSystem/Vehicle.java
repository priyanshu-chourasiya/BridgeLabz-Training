package com.inheritance.VehicleManagementSystem;

public class Vehicle {

    protected int maxSpeed;
    protected String model;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}
