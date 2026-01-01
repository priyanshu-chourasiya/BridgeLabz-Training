package com.polymorphism.VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    Car(String number, double rate, String policyNo) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Applied";
    }
}
