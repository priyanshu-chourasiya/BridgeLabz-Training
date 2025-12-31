package com.inheritance.VehicleandTransportSystem;

public class MotorCycle extends Vehicle{

	MotorCycle(int maxspeed, String fueltype) {
		super(maxspeed, fueltype);
		// TODO Auto-generated constructor stub
	}
	int cc = 400;
	void displayinfo() {
		System.out.println("maxspeed : " + maxspeed + " fueltype : " + fueltype + 
				" cc : " + cc);
	 }
}
