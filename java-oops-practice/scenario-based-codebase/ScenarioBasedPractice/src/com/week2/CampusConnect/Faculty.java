package com.week2.CampusConnect;

public class Faculty extends Person{
		
	String coursename;
	
	Faculty(String name, String email, int id) {
		super(name, email, id);
		// TODO Auto-generated constructor stub
	}
	public void printDetails() {
		//this.coursename = coursename;
		System.out.println(name + " " + coursename + " " + email + " " + id);
	}
}
