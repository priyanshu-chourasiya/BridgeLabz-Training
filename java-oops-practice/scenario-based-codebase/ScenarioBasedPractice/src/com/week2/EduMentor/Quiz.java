package com.week2.EduMentor;

public class Quiz {

    private String[] questions;
    private final char[] answers;
    private int score;

    public Quiz(String difficulty) {

        if (difficulty.equalsIgnoreCase("easy")) {
            questions = new String[]{
                    "What is size of int?",
                    "Which keyword is for inheritance?",
                    "Entry point of Java?",
                    "Which is non-primitive?",
                    "Best loop for fixed iterations?"
            };
            answers = new char[]{'b', 'c', 'c', 'c', 'c'};
        } else {
            questions = new String[]{
                    "JVM stands for?",
                    "Which is marker interface?",
                    "Which collection is synchronized?",
                    "Default value of boolean?",
                    "Which is immutable?"
            };
            answers = new char[]{'a', 'b', 'c', 'a', 'd'};
        }
    }

    public int attemptQuiz(char[] userAnswers) {
        score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (userAnswers[i] == answers[i]) {
                score++;
            }
        }
        return score;
    }

    public double calculatePercentage(int score) {
        return (score * 100.0) / answers.length;
    }
}
