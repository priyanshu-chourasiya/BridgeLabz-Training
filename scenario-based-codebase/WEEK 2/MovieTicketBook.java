/*
Movie Ticket Booking App
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBook {
    
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    char choice = 'n';
    do{
    int ticketprice = 0;
    System.out.println("Enter Movie type \n1. Horror \n2.ACTION \n3.COMEDY ");
    int movietype = input.nextInt();

    switch(movietype){
        case 1:
            System.out.println("You selected Horror movie !!!");
            ticketprice += 100;
            break;
        case 2:
            System.out.println("You selected Action movie !");
            ticketprice += 500;
            break;
        case 3:
            System.out.println("You selected Comedy movie !");
            ticketprice += 150;
            break;
        default:
            System.out.println("Wrong input ");
            break;
    }

    System.out.println("Enter seat type \n1. GOLD \n2.SILVER ");
    int seatype = input.nextInt();

    if(seatype == 1){
        System.out.println("You selected GOLD");
        ticketprice += 500;
    }
    else{
        System.out.println("You selected SILVER");
        ticketprice += 250;
    }

    System.out.println("Enter Snacks type \n1. Pizza \n2. Burger \n3. Combo ");
    int snacks = input.nextInt();

    if(snacks == 1){
        System.out.println("You selected pizza");
        ticketprice += 500;
    }
    else if(snacks == 2){
        System.out.println("You selected Burger");
        ticketprice += 300;
    }
    else{
        System.out.println("You selected Combo");
        ticketprice += 800;
    }

    System.out.println("Your ticket price is : " + ticketprice);

    System.out.println("Want to order for next ::: ? ");
    choice = input.next().charAt(0);

    }while(choice == 'y' || choice == 'Y');

    System.out.println("ENDED !");

    input.close();

    }
}
