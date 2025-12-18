import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner input = new Scanner(System.in);

        // input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Storing original 
        int originalNumber = number;

        // Create sum == 0
        int sum = 0;

        // Use while 
        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Add to sum
            sum = sum + digit;

            // Remove last digit
            number = number / 10;
        }

        // Check if original number is divisible by sum of digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number");
        }

        // Close scanner
        input.close();
    }
}
