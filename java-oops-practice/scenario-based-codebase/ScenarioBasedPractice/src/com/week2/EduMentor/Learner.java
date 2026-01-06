package com.week2.EduMentor;

public class Learner extends User {
	String coursename;
	public Learner(String name, String email, int userid, String coursename) {
		super(name, email, userid);
		// TODO Auto-generated constructor stub
		this.coursename = coursename;
	}
	
	public String getcoursename() {
		return coursename;
	}
}
