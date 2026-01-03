package com.week1.CabbyGo;

public class Driver {
	String name;
	int licensenumber;
	private int rating;
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Driver(String name, int licensenumber, int rating) {
		//super();
		this.name = name;
		this.licensenumber = licensenumber;
		this.rating = rating;
	}
	
}
