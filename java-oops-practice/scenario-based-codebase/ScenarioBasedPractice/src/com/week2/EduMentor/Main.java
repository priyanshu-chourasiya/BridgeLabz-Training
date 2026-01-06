/*
 * "EduMentor – Personalized Learning Platform"
Story: EduMentor is an AI-based learning platform. You're tasked with implementing the module
to manage courses, quizzes, and learner progress.

Requirements:
● User base class: name, email, userId.
● Learner and Instructor inherit from User.
● ICertifiable interface with method generateCertificate().
● Quiz class: fields for questions, answers, and score.
● Use constructors to create quizzes with variable difficulty.
● Encapsulation for quiz answers (can’t be modified once set).
● Use operators to score the quiz and generate a percentage.
● Polymorphism: generateCertificate() works differently for short courses vs
full-time.
● Apply access modifiers: internal question banks must remain private.
 */

package com.week2.EduMentor;

public class Main {
    public static void main(String[] args) {

        Learner learner = new Learner("Priyanshu", "priyanshu.com", 101, "Java DSA");

        Quiz quiz = new Quiz("Easy");
        int score = quiz.attemptQuiz(new char[]{'b', 'c', 'c', 'c', 'c'});

        double percentage = quiz.calculatePercentage(score);

        System.out.println("Score: " + score);
        System.out.println("Percentage: " + percentage);

        ICertifiable certificate;

        if(percentage >= 60) {
            certificate = new FullTime();
        } 
        else{
            certificate = new ShortCourse();
        }

        certificate.generateCertificate(learner.getcoursename());
    }
}

