package com.week1.VehicleRentalApplication;

public class Bike extends Vehicle{
	
	int helmatecharge;

	public Bike(int vehicleId, String brand, int baserent, int helmatecharge) {
		super(vehicleId, brand, baserent);
		// TODO Auto-generated constructor stub
		this.helmatecharge = helmatecharge;
	}
	
	void calculateRent(int days) {
		System.out.println(baserent * helmatecharge * days);
	}
	
}
