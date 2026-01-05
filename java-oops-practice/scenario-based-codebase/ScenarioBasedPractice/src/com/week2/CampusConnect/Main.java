/*
 * "CampusConnect – College Information System"
Story: Your university launches CampusConnect, a portal to manage students, teachers, and
courses. You're developing the academic module.
Requirements:
● Person (base class): common fields like name, email, id.
● Student and Faculty extend Person (use inheritance).
● ICourseActions interface with methods like enrollCourse() and dropCourse().
● Course class has a list of students and a faculty assigned.
● Use constructors to initialize students and courses.
● Use access modifiers: student grades must be private.
● Use operators to calculate GPA based on grades.
● Polymorphism: printDetails() works differently for Student and Faculty.
 */
package com.week2.CampusConnect;

public class Main {
    public static void main(String[] args) {

        // Create faculty
        Faculty faculty1 = new Faculty("Sharma", "sharma@.com", 101);

        // Create students
        Student student1 = new Student("Priyanshu", "priyanshu@.com", 201);
        Student student2 = new Student("Anika", "anika@.com", 202);

        // Create course and assign faculty
        Course course1 = new Course("JAVA", faculty1);

        
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);

       
        course1.printCourseDetails();

        System.out.println();

        
        student1.printDetails();
        student2.printDetails();

        System.out.println();

        
        faculty1.printDetails();

        System.out.println();

        
        course1.dropStudent(student2);

        
        course1.printCourseDetails();
    }
}

