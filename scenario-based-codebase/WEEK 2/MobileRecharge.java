/*
Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/
import java.util.Scanner;

public class MobileRecharge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int balance = 0;
        char choice = 'y';

        do {
            System.out.print("Enter mobile operator (VI/AIRTEL/JIO): ");
            String oper = input.next().toUpperCase();

            System.out.print("Enter recharge amount: ");
            int amount = input.nextInt();

            switch (oper) {
                case "VI":
                    System.out.println("VI Offer: Extra 2GB data");
                    break;

                case "AIRTEL":
                    System.out.println("Airtel Offer: Free Wynk Music");
                    break;

                case "JIO":
                    System.out.println("Jio Offer: Unlimited 5G");
                    break;

                default:
                    System.out.println("Invalid Operator");
                    continue;
            }

            balance += amount;
            System.out.println("Current Balance: " + balance);

            System.out.print("Do you want to recharge again? (y/n): ");
            choice = input.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("EXITTING...");
        
        input.close();
    }
}

