/*
Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).

*/

import java.util.*;

public class TrainReservation {

    static Scanner input = new Scanner(System.in);
    static boolean[] generalseats = new boolean[5];
    static boolean[] thirdACseats = new boolean[5];
    static boolean[] secondACseats = new boolean[5];
    static boolean[] firstACseats = new boolean[5];

    // show occupany
    public static void showoccupany(boolean[] arr){
        System.out.println("Available seats : ");
        for(int i = 0; i < 5; i++){
            if(arr[i] == false){
                System.out.print(i+1 + " ");
            }
        }
        System.out.println();
    }

// genreal class method
    public static void generalclassseat(){

        try{

        showoccupany(generalseats);

        System.out.println("Enter seat number : ");
        int choice = input.nextInt();
        choice -= 1;

        if(generalseats[choice] == false){
            System.out.println("Seat reserved for u ! : " + (int)(choice + 1));
            generalseats[choice] = true;
        }
        else{
            System.out.println("Already filled : " + (int)(choice + 1));
            generalclassseat();
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Seats are from 1 to 5");
            generalclassseat();
        }
    }

// third class method
    public static void thirdclassseats(){

        try{

        showoccupany(thirdACseats);

        System.out.println("Enter seat number : ");
        int choice = input.nextInt();

        choice -= 1;

        if(thirdACseats[choice] == false){
            System.out.println("Seat reserved for u ! : " + (int)(choice + 1));
            thirdACseats[choice] = true;
        }
        else{
            System.out.println("Already filled : " + (int)(choice + 1));
            thirdclassseats();
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Seats are from 1 to 5");
            thirdclassseats();
        }
    }

// second class method    
    public static void secondclassseats(){

        try{

        showoccupany(secondACseats);

        System.out.println("Enter seat number : ");
        int choice = input.nextInt();

        choice -= 1;

        if(secondACseats[choice] == false){
            System.out.println("Seat reserved for u ! : " + (int)(choice + 1));
            secondACseats[choice] = true;
        }
        else{
            System.out.println("Already filled : " + (int)(choice + 1));
            secondclassseats();
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Seats are from 1 to 5");
            secondclassseats();
        }
    }

// first class method    
    public static void firstclassseats(){

        try{
        showoccupany(firstACseats);

        System.out.println("Enter seat number : ");
        int choice = input.nextInt();

        choice -= 1;

        if(firstACseats[choice] == false){
            System.out.println("Seat reserved for u ! : " + (int)(choice + 1));
            firstACseats[choice] = true;
        }
        else{
            System.out.println("Already filled : " + (int)(choice + 1));
            firstclassseats();
        }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Seats are from 1 to 5");
            firstclassseats();
        }
    }

    // main method
    public static void main(String args[]){


        while(true){

        System.out.println("ENTER 1 : FOR GENERAL ");
        System.out.println("ENTER 2 : FOR THRID AC ");
        System.out.println("ENTER 3 : FOR SECOND AC ");
        System.out.println("ENTER 4 : FOR FIRST AC ");
        System.out.println("ENTER 5 : TO EXIT MENU ");

        int choice = input.nextInt();
        
        if(choice == 5){
            System.out.println("Thank u for using :: ");
            break;
        }
        switch(choice){
            case 1:
                generalclassseat();
                break;
            case 2:
                firstclassseats();
                break;
            case 3:
                secondclassseats();
                break;
            case 4:
                firstclassseats();
                break;
            default:
                System.out.println("Entered wrong ::: ");
                main(args);
                break;
        }
    }
    }
}
