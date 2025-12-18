import java.util.*;

public class Armstrong{
	public static void main(String args[]){
		
		// declaring a scanner object
		Scanner input = new Scanner(System.in);
		
		// Get integer input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define sum variable and initialize to 0
        int sum = 0;

        // Store the original number
        int originalNumber = number;

        // while loop 
        while (originalNumber != 0) {

            // find the last digit using modulus operator
            int digit = originalNumber % 10;

            // find cube of the digit and add it to sum
            sum = sum + (digit * digit * digit);

            // removing the last digit 
            originalNumber = originalNumber / 10;
        }

        // Check if sum == original
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }
		
		// closing input
		input.close();
	}
}

