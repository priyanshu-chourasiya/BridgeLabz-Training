package com.week1.UniversityCourseEnrollmentSystem;

import java.util.ArrayList;

public class Student {
    protected int studentId;
    protected String name;
    private double gpa;

    protected ArrayList<Enrollment> enrollments = new ArrayList<>();

    // Constructor without electives
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Constructor with elective preference
    public Student(int studentId, String name, String elective) {
        this.studentId = studentId;
        this.name = name + " (Elective: " + elective + ")";
    }

    public void enrollCourse(Course course) {
        Enrollment e = new Enrollment(this, course);
        enrollments.add(e);
    }

    protected void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void getTranscript() {
        System.out.println("Student: " + name);
        for (Enrollment e : enrollments) {
            e.displayEnrollmentDetails();
        }
        System.out.println("GPA: " + gpa);
    }

    public void calculateGPA() {
        // overridden in subclasses
    }
}
