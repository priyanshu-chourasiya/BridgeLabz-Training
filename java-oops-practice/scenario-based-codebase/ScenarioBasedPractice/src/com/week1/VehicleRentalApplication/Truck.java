package com.week1.VehicleRentalApplication;

public class Truck extends Vehicle{
	int loadCharge;

	public Truck(int vehicleId, String brand, int baserent,int loadCharge) {
		super(vehicleId, brand, baserent);
		this.loadCharge  = loadCharge;
	}
	
	void calculateRent(int days) {
		System.out.println(baserent * loadCharge * days);
	}
}
