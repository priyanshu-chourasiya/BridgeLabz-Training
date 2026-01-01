package com.week1.EmployeeManagement;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(5000);
        Employee emp2 = new PartTimeEmployee(600);

        emp1.salaryCalc(); 
        emp2.salaryCalc(); 
    }
}
