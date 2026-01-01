package com.polymorphism.VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    Bike(String number, double rate, String policyNo) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Applied";
    }
}
