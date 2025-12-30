package com.objectmodeling;

import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.students.add(this);
    }

    void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses)
            System.out.println(c.name);
    }
}

class School {
    List<Student> students = new ArrayList<>();
}

public class SchoolCourse {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi");
        Course c1 = new Course("Math");

        s1.enroll(c1);
        s1.viewCourses();
    }
}
