/*
The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.

*/

import java.util.Scanner;

public class NumberBasedGame {
    
    //(int)(Math.random() * (max - min + 1)) + min
    static Scanner input = new Scanner(System.in);

    public static int guess(){
        return (int)(Math.random()*(100 - 1 + 1)) + 1;
    }

    public static void main(String[] args) {
        int ans = guess();
        int counter = 0;
        int i = 0;
        do{
            System.out.print("Enter number : ");
            i = input.nextInt();
            if(i == ans){
                System.out.println("RIGHT");
                break;
            }
            if(i > ans){
                System.out.println("TOO HIGH");
            }
            else{
                System.out.println("TOO LOW");
            }
            counter += 1;
            if(counter == 5){
                System.out.println("Correct was : " + ans);
                break;
            }
        }
        while(i != ans);
    }
}
