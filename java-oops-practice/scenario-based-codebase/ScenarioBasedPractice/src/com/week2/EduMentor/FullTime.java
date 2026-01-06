package com.week2.EduMentor;

public class FullTime implements ICertifiable{
	
	//String coursename;
	@Override
	public void generateCertificate(String coursename) {
		// TODO Auto-generated method stub
		//this.coursename = coursename;
		System.out.println("Full time certificate : " + coursename);
	}

}
