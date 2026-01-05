package com.week2.CampusConnect;

public class Person {
	protected String name;
	protected String email;
	protected int id;
	Person(String name, String email, int id) {
		//super();
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	public void printDetails() {
		System.out.println("Printing details");
	}
	
}
