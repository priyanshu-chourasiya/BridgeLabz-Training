package com.week2.CampusConnect;

public class Student extends Person implements ICourseActions{
	
	String coursename;
	
	private char grades;
	

	public char getGrades() {
		return grades;
	}

	public void setGrades(char grades) {
		this.grades = grades;
	}

	Student(String name, String email, int id) {
		super(name, email, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enrollCourse(String coursename) {
		this.coursename = coursename;
		System.out.println("You enrolled : " + coursename);
		
	}

	@Override
	public void dropCourse(String coursename) {
		// TODO Auto-generated method stub
		this.coursename = coursename;
		System.out.println("You dropped : " + coursename);
		
	}
	
	public void printDetails() {
		//this.coursename = coursename;
		System.out.println(name + " " + coursename + " " + email + " " + id);
	}
	
	public void getGPA(char grades) {
		this.grades = grades;
		if(grades == 'A') {
			System.out.println("EXCELLENT");
		}
		else if(grades == 'B') {
			System.out.println("GOOD");
		}
		else {
			System.out.println("NEED IMPROVEMENT");
		}
	}

}
