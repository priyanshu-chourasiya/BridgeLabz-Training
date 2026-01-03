package com.week1.CabbyGo;

public class Sedan extends Vehicle implements IRideService {
	
	int basefare = 1000;
	int distance;
	int rate;
	public Sedan(int vehiclenumber, int capacity, String type,int rate) {
		super(vehiclenumber, capacity, type);
		//this.distance = distance;
		this.rate = rate;
	}

	@Override
	public void bookRide(int distance) {
		// TODO Auto-generated method stub
		this.distance = distance;
		System.out.println("Starting : " + " with distance : " + distance);
		
		
	}

	@Override
	public void endRide() {
		// TODO Auto-generated method stub
		System.out.println("Thanku!!!!!");
		
	}
	
	public void CalculateRate(int basefare) {
		int fair = basefare + distance * rate;
		System.out.println("Fair : " + fair);
	}

	

}
