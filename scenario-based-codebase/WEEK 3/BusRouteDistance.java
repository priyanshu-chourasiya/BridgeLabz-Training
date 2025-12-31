/*
 Bus Route Distance Tracker 
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;

public class BusRouteDistance {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int totaldistance = 0;
        char choice = 'y';

        while(true){
            totaldistance += 10;
            System.out.println("You wanna exit here ? (y/n) : ");
            choice = input.next().charAt(0);
            if(choice == 'Y' || choice == 'y'){
                break;
            }
        }

        System.out.println("Total distance travelled: " + totaldistance + " km");

        input.close();

    }
}
