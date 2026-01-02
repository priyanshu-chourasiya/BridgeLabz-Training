package com.week1.VehicleRentalApplication;

public class Car extends Vehicle {
	int insuranceCharge;

	public Car(int vehicleId, String brand, int baserent,int insuranceCharge) {
		super(vehicleId, brand, baserent);
		this.insuranceCharge = insuranceCharge;
	}
	
	void calculateRent(int days) {
		System.out.println(baserent * insuranceCharge * days);
	}
	
}
