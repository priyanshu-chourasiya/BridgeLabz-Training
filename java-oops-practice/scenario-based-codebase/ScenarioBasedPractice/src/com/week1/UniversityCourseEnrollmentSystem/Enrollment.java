package com.week1.UniversityCourseEnrollmentSystem;

public class Enrollment {
    private Student student;
    private Course course;
    private char grade;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public void displayEnrollmentDetails() {
        System.out.println(course.getCourseName() + " Grade: " + grade);
    }
}
