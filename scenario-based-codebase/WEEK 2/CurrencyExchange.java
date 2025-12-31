/*
Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.*;

public class CurrencyExchange {
    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    char choice = 'n';
    do{
    System.out.println("Enter INR amount : ");
    int amount = input.nextInt();

    System.out.println("Enter taget currency : ");
    System.out.println("1. Dollars (USA) ");
    System.out.println("2. Taka (Bangladesh) ");
    System.out.println("3. Rupiah(Indornasia) ");
    System.out.println("4. Paso  (Argentina) ");

    int currency = input.nextInt();

    switch(currency){
        case 1:
            System.out.println("You selected Dollars ");
            System.out.println("Inr " + amount + " in dollars is : " + amount * 90);
            break;
        case 2:
            System.out.println("You selected Taka ");
            System.out.println("Inr " + amount + " in Taka is : " + amount * 0.50);
            break;
        case 3:
            System.out.println("You selected Rupiah ");
            System.out.println("Inr " + amount + " in Rupiah is : " + amount * 30);
            break;
        case 4:
            System.out.println("You selected Paso ");
            System.out.println("Inr " + amount + " in Paso is : " + amount * 200);
            break;
        default:
            System.out.println("Wrong input !!!!!!!!!!!!!!!!!!!!");
            break;
    }
    System.out.println("You wanna continus ? (y/n) : ");
    choice = input.next().charAt(0);
    }while(choice == 'y' || choice == 'Y');
    }
}
 