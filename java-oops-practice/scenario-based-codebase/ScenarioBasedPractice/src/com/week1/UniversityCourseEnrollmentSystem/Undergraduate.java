package com.week1.UniversityCourseEnrollmentSystem;

public class Undergraduate extends Student {

    private String major;

    public Undergraduate(int studentId, String name, String major) {
        super(studentId, name);
        this.major = major;
    }

    @Override
    public void calculateGPA() {
        double totalPoints = 0;

        for (Enrollment e : enrollments) {
            switch (e.getGrade()) {
                case 'A': totalPoints += 10; break;
                case 'B': totalPoints += 8; break;
                case 'C': totalPoints += 6; break;
                default: totalPoints += 0;
            }
        }
        setGpa(totalPoints / enrollments.size());
    }
}
