package com.week1.UniversityCourseEnrollmentSystem;

public class Course {
    private int courseId;
    private String courseName;
    private int credits;

    public Course(int courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourseInfo() {
        System.out.println(courseId + " " + courseName + " " + credits);
    }
}
