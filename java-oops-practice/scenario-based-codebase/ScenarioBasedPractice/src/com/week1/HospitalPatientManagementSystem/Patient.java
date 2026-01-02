package com.week1.HospitalPatientManagementSystem;

public class Patient {

    int patientId;
    String name;
    int age;
    private String medicalHistory;

    boolean isEmergency;
    int emergencyCharge;

    //Normal Admission
    Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.isEmergency = false;
        this.emergencyCharge = 0;
    }

    //Emergency Admission
    Patient(int patientId, String name, int age,
            String medicalHistory, int emergencyCharge) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.isEmergency = true;
        this.emergencyCharge = emergencyCharge;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    void displayInfo() {
        System.out.println(patientId + " " + name + " " + age);
        if (isEmergency) {
            System.out.println("Emergency Case (Extra Charge: " + emergencyCharge + ")");
        }
    }
}
