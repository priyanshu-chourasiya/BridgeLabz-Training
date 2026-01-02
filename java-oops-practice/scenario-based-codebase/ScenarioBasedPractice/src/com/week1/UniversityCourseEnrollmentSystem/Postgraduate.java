package com.week1.UniversityCourseEnrollmentSystem;

public class Postgraduate extends Student {

    private String specialization;

    public Postgraduate(int studentId, String name, String specialization) {
        super(studentId, name);
        this.specialization = specialization;
    }

    @Override
    public void calculateGPA() {
        int passCount = 0;

        for (Enrollment e : enrollments) {
            if (e.getGrade() == 'P') {
                passCount++;
            }
        }
        setGpa((double) passCount / enrollments.size() * 10);
    }
}
