import java.util.*;

public class AbundantNumber {
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner input = new Scanner(System.in);

        // input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create sum == 0
        int sum = 0;

        // Run for loop 
        for (int i = 1; i < number; i++) {

            // Checking divisibility
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check if sum of divisors is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }

        // Close scanner
        input.close();
    }
}
