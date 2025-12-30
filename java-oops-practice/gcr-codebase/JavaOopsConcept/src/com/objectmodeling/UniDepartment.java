package com.objectmodeling;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class University {
    String name;
    Department dept;
    Faculty faculty; // aggregation

    University(String name, Department dept) {
        this.name = name;
        this.dept = dept;
    }

    void closeUniversity() {
        dept = null;
        System.out.println("University closed");
    }
}

public class UniDepartment {
    public static void main(String[] args) {
        Faculty f = new Faculty("Dr. Priyanshu");
        Department d = new Department("CS");

        University u = new University("ABC University", d);
        u.closeUniversity();

        System.out.println(f.name + " still exists");
    }
}

