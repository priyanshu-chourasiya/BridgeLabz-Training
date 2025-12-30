package com.objectmodeling;

import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    List<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void closeCompany() {
        departments.clear(); // all departments & employees deleted
        System.out.println("Company closed");
    }
}

public class CompanyEmp {
    public static void main(String[] args) {
        Company c = new Company("ABC");
        Department d1 = new Department("IT");

        d1.addEmployee("Priyanshu");
        d1.addEmployee("Neha");

        c.addDepartment(d1);
        c.closeCompany();
    }
}
