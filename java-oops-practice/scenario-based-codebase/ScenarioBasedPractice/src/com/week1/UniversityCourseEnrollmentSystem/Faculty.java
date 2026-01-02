package com.week1.UniversityCourseEnrollmentSystem;

public class Faculty implements Graded {

    private int facultyId;
    private String name;
    private String department;

    public Faculty(int facultyId, String name, String department) {
        this.facultyId = facultyId;
        this.name = name;
        this.department = department;
    }

    @Override
    public void assignGrade(Enrollment enrollment) {
        enrollment.setGrade('A'); // default example
    }
}
