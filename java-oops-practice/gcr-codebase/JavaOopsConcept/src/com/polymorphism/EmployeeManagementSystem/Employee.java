package com.polymorphism.EmployeeManagementSystem;

abstract class Employee {

    private int employeeId;
    private String name;
    protected double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println(
            "ID: " + employeeId +
            " Name: " + name +
            " Salary: " + calculateSalary()
        );
    }
}
