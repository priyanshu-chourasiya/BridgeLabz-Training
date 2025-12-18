import java.util.*;

public class FactorialFor{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring variable and taking user input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// checking number is not negative
		if(number > 0){
			
			// declaring variables
			int factorial = 1;
			
			// finding factorial using for loop
			for(int i = 1; i <= number; i++){
				factorial *= i;
			}
			
			// displaying the result
			System.out.print("Factorial is : " + factorial);
		}
		else{
		
			// Printing invalid if number is neagtive
			System.out.print("Enter positive number");
		}
		
		// closing scanner object
		input.close();
	}
}