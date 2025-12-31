/*
 Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;

public class FestivalDraw {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // taking size of visitors
        System.out.println("Enter number of visitors : ");
        int visitors = input.nextInt();
        int draw = 0;
        for(int i = 1; i <= visitors; i++){
            System.out.println("Enter a number : ");
            draw = input.nextInt();
            if(draw % 3 == 0 && draw % 5 == 0){
                System.out.println("You won !!!");
            }
            else{

                System.out.println("Better luck next time");
            }
        }

        input.close();
    }
}
