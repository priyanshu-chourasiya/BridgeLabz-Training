package com.week1.VehicleRentalApplication;

public class Customer {
	int customerId;
	String name;
	
	public Customer(int customerId, String name) {
		this.customerId = customerId;
		this.name = name;
	}

	void displayCustomerInfo() {
		System.out.println(customerId + " " + name);
	}
}
