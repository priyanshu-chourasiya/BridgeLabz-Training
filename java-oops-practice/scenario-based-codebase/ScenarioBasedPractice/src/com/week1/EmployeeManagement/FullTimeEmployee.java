package com.week1.EmployeeManagement;

public class FullTimeEmployee extends Employee {

    FullTimeEmployee(int salary) {
        super(salary);
    }

    @Override
    void salaryCalc() {
        System.out.println("Full Time Salary: " + (salary + salary * 20 / 100));
    }
}
