import java.util.*;

public class CountDigits{
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Getting input from user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Create count variable == 0
        int count = 0;

        // use while
        while (number != 0) {

            // remove the last digit of the number
            number = number / 10;

            // increase count by 1
            count++;
        }

        // display the result
        System.out.println("Number of digits = " + count);

        // Close scanner
        input.close();
    }
}
