/*
Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Arrays;
import java.util.Scanner;

public class ShopkeeperDiscount {
    
    static Scanner input = new Scanner(System.in);

    // methods
    // to take userinput of items
    public static int[] takingInput(){

        System.out.print("Enter items ");
        int noofitems = input.nextInt();

        int[] cart = new int[noofitems];

        try{
        for(int i = 0; i < noofitems; i++){
            System.out.print("Enter price of item : " + (i + 1) + " ");
            cart[i] = input.nextInt();
        }
        System.out.println();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return cart;
    }

    // sum of items
    public static int sumofcart(int[] arr){
        System.out.println("Sum of items is : ");
        System.out.print(Arrays.stream(arr).sum());
        return Arrays.stream(arr).sum();
    }

    // discount method 
    // calculating discount
    public static double discount(int sum){

        if(sum > 500){
            return sum * 0.5;
        }
        else if(sum > 1000){
            return sum * 0.5;
        }
        else{
            return sum * 0.1;
        }
    }

    // main method
    public static void main(String[] args) {
        double discount = discount(sumofcart(takingInput()));
        System.out.println("Discount is : " + discount);
    }

}
