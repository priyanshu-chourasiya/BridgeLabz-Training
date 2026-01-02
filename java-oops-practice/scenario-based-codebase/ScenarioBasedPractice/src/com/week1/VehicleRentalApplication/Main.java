package com.week1.VehicleRentalApplication;

public class Main {
	public static void main(String args[]) {
		Customer c1 = new Customer(1,"Priyanshu");
		Bike b1 = new Bike(123, "Hero", 500, 100);
		Car ca1 = new Car(456,"Thar",1000,500);
		Truck t1 = new Truck(789,"Swaraj",5000,800);
		
		ca1.displayInfo();
		b1.displayInfo();
		t1.displayInfo();
		
		ca1.calculateRent(10);
		b1.calculateRent(20);
		t1.calculateRent(30);
		
		
	}
}
