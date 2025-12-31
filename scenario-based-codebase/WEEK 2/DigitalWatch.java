/*
Digital Watch Simulation ⏱
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

import java.util.Scanner;

public class DigitalWatch {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner input = new Scanner(System.in);

        for(int hour = 0 ; hour <= 24; hour++){
            for(int min = 0; min <= 59; min++){
                System.out.println("Time is " + hour + " : " + min);
                Thread.sleep(100);
            }
            Thread.sleep(200);
        }
        System.out.print("stop at 13:00");

        input.close();
    }
}
