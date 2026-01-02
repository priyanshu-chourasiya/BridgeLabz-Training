/*
 * Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain
billing.
Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose
getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals
● OOP:
○ Encapsulation: Private fields with getter/setters
○ Abstraction: Hide billing calculation behind interface
○ Inheritance: InPatient, OutPatient extend Patient
○ Polymorphism: displayInfo() overridden for Doctor, Patient, etc.
 */

package com.week1.HospitalPatientManagementSystem;

public class Main {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(101, "Dr Sharma", "Cardiology");

        Patient p1 = new InPatient(
                1, "Rahul", 25, "Heart Issue",
                202, 5, 1000);

        Bill bill1 = new Bill(p1, d1);
        bill1.displayBill();
    }
}
