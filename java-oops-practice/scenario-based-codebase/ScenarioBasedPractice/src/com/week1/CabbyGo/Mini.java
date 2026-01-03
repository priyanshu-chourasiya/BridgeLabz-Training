package com.week1.CabbyGo;

public class Mini extends Vehicle implements IRideService {
	
	int basefare = 500;
	int distance;
	int rate;
	public Mini(int vehiclenumber, int capacity, String type,int rate) {
		super(vehiclenumber, capacity, type);
		//this.distance = distance;
		this.rate = rate;
	}

	@Override
	public void bookRide(int distance) {
		this.distance = distance;
		// TODO Auto-generated method stub
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
