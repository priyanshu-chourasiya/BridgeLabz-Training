package com.week1.HospitalPatientManagementSystem;

public class Doctor {
	
	int doctorId;
	String name;
	String specialization;
	
	
	
	public Doctor(int doctorId, String name, String specialization) {
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
	}



	void displayInfo() {
		System.out.println(" " + doctorId + " " + name + " " + specialization);
	}
}
