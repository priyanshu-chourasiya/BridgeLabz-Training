package com.objectmodeling;

class Course {
    String name;
    Professor professor;

    Course(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        professor = p;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        System.out.println(name + " enrolled in " + c.name);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

public class CourseStuProf {
    public static void main(String[] args) {
        Student s = new Student("Priyanshu");
        Professor p = new Professor("ABC");
        Course c = new Course("JAVA");

        c.assignProfessor(p);
        s.enrollCourse(c);
    }
}
