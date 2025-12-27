package com.constructor.levelone;

class Course {
    String courseName;
    String duration;
    double fee;
    static String instituteName = "Default Institute";

    Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", "3 Months", 15000);
        c1.displayCourseDetails();

        Course.updateInstituteName("BridgeLabz");
        c1.displayCourseDetails();
    }
}

