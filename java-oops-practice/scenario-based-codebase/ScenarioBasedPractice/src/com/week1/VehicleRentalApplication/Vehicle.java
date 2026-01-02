package com.week1.VehicleRentalApplication;

public class Vehicle {
	protected int vehicleId;
	protected String brand;
	protected int baserent;
	public Vehicle(int vehicleId, String brand, int baserent) {
		//super();
		this.vehicleId = vehicleId;
		this.brand = brand;
		this.baserent = baserent;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrancd() {
		return brand;
	}
	public void setBrancd(String brancd) {
		this.brand = brancd;
	}
	public int getBaserent() {
		return baserent;
	}
	public void setBaserent(int baserent) {
		this.baserent = baserent;
	}
	
	void displayInfo() {
		System.out.println(vehicleId + " " + brand + " " + baserent);
	}
	
	
	
	
}
