package com.week1.HospitalPatientManagementSystem;

public class OutPatient extends Patient {

    int consultationFee;

    OutPatient(int patientId, String name, int age,
               String medicalHistory, int consultationFee) {
        super(patientId, name, age, medicalHistory);
        this.consultationFee = consultationFee;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Consultation Fee: " + consultationFee);
    }
}
