import java.util.*;

public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = input.nextInt();

        // Check for positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            System.exit(0);
        }

        // Create String array
        String[] result = new String[n];

        // Loop to save FizzBuzz results
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            } else {
                result[i - 1] = String.valueOf(i);
            }
        }

        // Loop to print array values with position
        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }

        input.close();
    }
}
