package com.polymorphism.EmployeeManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Ravi", 50000);
        Employee e2 = new PartTimeEmployee(102, "Anita", 80, 300);

        employees.add(e1);
        employees.add(e2);

        for (Employee e : employees) {
            e.displayDetails(); // polymorphic call
        }
    }
}
