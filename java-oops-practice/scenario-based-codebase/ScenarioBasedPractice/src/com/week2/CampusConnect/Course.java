package com.week2.CampusConnect;

import java.util.ArrayList;

public class Course {

    String courseName;
    Faculty faculty; // Faculty assigned to this course
    ArrayList<Student> students; // List of enrolled students

    // Constructor to initialize course name and optionally faculty
    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
        // Assign this course name to faculty
        if(faculty != null) {
            faculty.coursename = courseName;
        }
    }

    // Assign faculty to the course
    public void assignFaculty(Faculty faculty) {
        this.faculty = faculty;
        faculty.coursename = this.courseName;
    }

    // Enroll a student
    public void enrollStudent(Student student) {
        students.add(student);
        student.coursename = this.courseName;
        System.out.println(student.name + " enrolled in " + courseName);
    }

    // Drop a student
    public void dropStudent(Student student) {
        students.remove(student);
        student.coursename = null;
        System.out.println(student.name + " dropped from " + courseName);
    }

    // Print course details
    public void printCourseDetails() {
        System.out.println("Course: " + courseName);
        if(faculty != null)
            System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled students:");
        for(Student s : students)
            System.out.println(" " + s.name);
    }
}
