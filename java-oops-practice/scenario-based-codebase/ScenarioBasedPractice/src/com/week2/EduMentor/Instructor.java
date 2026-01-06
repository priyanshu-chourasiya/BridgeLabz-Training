package com.week2.EduMentor;

public class Instructor extends User{
	
	String coursename;
	public Instructor(String name, String email, int userid,String coursename) {
		super(name, email, userid);
		// TODO Auto-generated constructor stub
		this.coursename = coursename;
	}

}
