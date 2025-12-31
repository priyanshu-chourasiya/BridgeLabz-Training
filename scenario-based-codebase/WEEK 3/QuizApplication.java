/*
Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class QuizApplication {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // questions
        String[] questions = {
            "1. What is the size of int in Java?",
            "2. Which keyword is used to inherit a class?",
            "3. Which method is the entry point of Java program?",
            "4. Which of these is not a primitive data type?",
            "5. Which loop is best when number of iterations is known?"
        };

        // Options
        String[][] options = {
            {"a) 2 bytes", "b) 4 bytes", "c) 8 bytes", "d) Depends on OS"},
            {"a) implement", "b) inherit", "c) extends", "d) super"},
            {"a) start()", "b) run()", "c) main()", "d) init()"},
            {"a) int", "b) double", "c) String", "d) char"},
            {"a) while", "b) do-while", "c) for", "d) switch"}
        };

        // Correct answers
        char[] answers = {'b', 'c', 'c', 'c', 'c'};

        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = input.next().toLowerCase().charAt(0);

            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        score++;
                        System.out.println("Correct!");
                    } else {
                        System.out.println("Wrong! Correct answer is: " + answers[i] + " ");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + "/5");

        input.close();
    }
}
