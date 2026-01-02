package com.week1.UniversityCourseEnrollmentSystem;

public class Main {
    public static void main(String[] args) {

        Course c1 = new Course(101, "Data Structures", 4);

        Undergraduate ug = new Undergraduate(1, "Ankit", "CSE");
        Postgraduate pg = new Postgraduate(2, "Riya", "AI");

        ug.enrollCourse(c1);
        pg.enrollCourse(c1);

        Faculty f1 = new Faculty(11, "Dr Sharma", "CS");

        f1.assignGrade(ug.enrollments.get(0));
        ug.calculateGPA();

        pg.enrollments.get(0).setGrade('P');
        pg.calculateGPA();

        ug.getTranscript();
        pg.getTranscript();
    }
}
