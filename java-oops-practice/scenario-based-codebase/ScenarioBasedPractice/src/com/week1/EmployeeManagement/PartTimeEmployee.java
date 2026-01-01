package com.week1.EmployeeManagement;

public class PartTimeEmployee extends Employee {

    PartTimeEmployee(int salary) {
        super(salary);
    }

    @Override
    void salaryCalc() {
        System.out.println("Part Time Salary: " + (salary + salary * 10 / 100));
    }
}
