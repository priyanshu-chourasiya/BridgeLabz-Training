package com.week1.HospitalPatientManagementSystem;

public class InPatient extends Patient {

    int roomNumber;
    int numberOfDays;
    int dailyRoomCharge;

    InPatient(int patientId, String name, int age, String medicalHistory,
              int roomNumber, int numberOfDays, int dailyRoomCharge) {
        super(patientId, name, age, medicalHistory);
        this.roomNumber = roomNumber;
        this.numberOfDays = numberOfDays;
        this.dailyRoomCharge = dailyRoomCharge;
    }

    int calculateRoomCost() {
        return numberOfDays * dailyRoomCharge;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Room No: " + roomNumber);
        System.out.println("Days: " + numberOfDays);
        System.out.println("Daily Charge: " + dailyRoomCharge);
    }
}
