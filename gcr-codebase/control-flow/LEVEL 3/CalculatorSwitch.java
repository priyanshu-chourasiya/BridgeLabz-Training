import java.util.*;

public class CalculatorSwitch {
    public static void main(String[] args) {

		// declaring scanner class object
        Scanner sc = new Scanner(System.in);

        // Declare variables
        double first, second;
        String op;

        // Take input
        System.out.print("Enter first number: ");
        first = sc.nextDouble();
        System.out.print("Enter second number: ");
        second = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next();

        // Switch case
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                if (second != 0) {
                    System.out.println("Result = " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
	
	
		// closing input
        sc.close();
    }
}
