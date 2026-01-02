package com.week1.HospitalPatientManagementSystem;

public class Bill implements Payable {

    Patient patient;
    Doctor doctor;
    double tax = 0.05;       // 5%
    double discount = 0.10;  // 10%

    public Bill(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    @Override
    public double calculatePayment() {
        double amount = 0;

        if (patient instanceof InPatient) {
            InPatient ip = (InPatient) patient;
            amount = ip.calculateRoomCost();
        } else if (patient instanceof OutPatient) {
            OutPatient op = (OutPatient) patient;
            amount = op.consultationFee;
        }

        double taxAmount = amount * tax;
        double discountAmount = amount * discount;

        double finalAmount = amount + taxAmount - discountAmount;

        return finalAmount;
    }

    void displayBill() {
        patient.displayInfo();
        doctor.displayInfo();
        System.out.println("Final Bill Amount: " + calculatePayment());
    }
}
