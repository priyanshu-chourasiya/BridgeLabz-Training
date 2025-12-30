/*
Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TempLogger {

    static Scanner input = new Scanner(System.in);

    // declaring an array to store temperature of 7 days
    static int[] temp = new int[7];

    // taking input of temp
    public static void tempInput(){

        for(int i = 0; i < 7; i++){
            System.out.print("Enter temp for day : " + (int)(i + 1) + " : ");
            temp[i] = input.nextInt();
            System.out.println();
        }
    }

    // method to find max temp
    public static int findMax(){
        int max = temp[0];
        for(int i = 0;i < 7; i++){
            if(max < temp[i]){
                max = temp[i];
            }
        }
        return max;
    }

    // method to find average 
    public static double findAverage(){
        int sum = 0;
        for(int i = 0; i < 7; i++){
            sum += temp[i];
        }
        return sum/7;

    }

    // main
    public static void main(String[] args) {
        tempInput();
        System.out.println("MAX : " + findMax());
        System.out.println("AVERAGE : " + findAverage());
    }


}
