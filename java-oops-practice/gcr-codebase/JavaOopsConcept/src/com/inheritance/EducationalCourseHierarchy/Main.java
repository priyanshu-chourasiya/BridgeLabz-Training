package com.inheritance.EducationalCourseHierarchy;

public class Main {

    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Udemy",
                true,
                5000,
                20
        );

        course.displayDetails();
    }
}

