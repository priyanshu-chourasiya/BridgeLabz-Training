package com.polymorphism.VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    Truck(String number, double rate, String policyNo) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNo;
    }

    @Override
    double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Applied";
    }
}
