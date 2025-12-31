package com.inheritance.SchoolSystemwithDifferentRoles;

public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Rahul", 16, "10th Grade");
        Staff staff = new Staff("Suresh", 35, "Administration");

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}
