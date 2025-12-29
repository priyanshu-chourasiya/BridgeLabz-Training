/*
6. Parking Lot Gate System 
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/

import java.util.Scanner;

public class LotGateSystem{
	
    static Scanner input = new Scanner(System.in);

    // declaring a boolean array with size 10
    static boolean[] size = new boolean[10];

    // methods
    // to do parking 
    public static void park(){

        showOccupancy();
        System.out.print("Enter lot : ");
        int lot = input.nextInt();
        lot -= 1;
        if(lot >= 0 && lot <= 9){
            if(size[lot] == false){
                System.out.println("Parked at : " + (lot + 1));
                size[lot] = true;
            }
            else{
                System.out.println("Already occupied ****");
            }
        }
        else{
            System.out.println("Invalid input ********");
            park();
        }
    }

    // to exit
    public static void exit(){

        showOccupancy();

        System.out.print("Enter lot : ");
        int lot = input.nextInt();
        lot -= 1;
        if(lot >= 0 && lot <= 9){
            if(size[lot] == true){
                System.out.println("Exiting at : " + (lot + 1));
                size[lot] = false;
            }
            else{
                System.out.println("Its empty ****");
            }
        }
        else{
            System.out.println("Invalid input ********");
            exit();
        }
    }

    // to show occupancy
    public static void showOccupancy(){
        System.out.println("Available lots : ");
        for(int i = 0; i < 10; i++){
            if(size[i] == false){
                System.out.print(i + 1 + " ");
            }
        }
        System.out.println();
    }

    // check full
    public static boolean full(){
        for(int i = 0; i < 10; i++){
            if(size[i] == false){
                return false;
            }
        }
        return true;
    }

    // main
    public static void main(String[] args) {
        
        while(true){
        
        if(full() == true){
            System.out.println("Lot full try later!!!!");
            System.exit(0);
            break;
        }

        try{
        System.out.println("Enter 1. : Park ");
        System.out.println("Enter 2. : exit parking ");
        System.out.println("Enter 3. : occupancy ");
        System.out.println("Enter 4. : exit program ");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        int call = input.nextInt();

        switch (call) {
            case 1:
                park();
                break;
        
            case 2:
                exit();
                break;
            case 3:
                showOccupancy();
                break;
            case 4:
                System.exit(0);
                break;
        }

    }

    }

} 
