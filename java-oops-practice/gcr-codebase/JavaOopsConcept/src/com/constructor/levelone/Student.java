package com.constructor.levelone;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent(int rollNumber, String name) {
        super(rollNumber, name);
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent ps = new PostgraduateStudent(101, "Rahul");
        ps.setCGPA(8.4);
        ps.displayStudent();
    }
}
