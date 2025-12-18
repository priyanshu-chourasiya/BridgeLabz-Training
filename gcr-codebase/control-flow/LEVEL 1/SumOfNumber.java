import java.util.*;

public class SumOfNumber{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// initializing variables
		double total = 0.0;
		
		// taking user input of number outside loop
		System.out.print("Enter value : ");
		double number = input.nextDouble();
		total += number;
		
		while(number != 0){
			
			// taking user input inside loop
			System.out.print("Enter value : ");
			number = input.nextDouble();
			
			// adding number to the total variable
			total += number;
		}
		
		System.out.print("Sum is : " + total);
		
		// closing Scanner object
		input.close();
	}
}