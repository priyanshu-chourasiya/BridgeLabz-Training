import java.util.*;

public class NaturalNumber{
	public static void main(String args[]){
		
		// Declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// decalring variable for natural number and taking
		// user input of it
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// checking the number (is it a natural number)
		if(number >= 0){
			// declaring a sum variable which will store the sum of nautal number
			int sum = 0;
			
			// finding the sum of natural numbers
			// using formula sum = n*(n+1)/2
			sum = (number * (number + 1))/2;
			
			// displyinf the result
			System.out.print("The sum of " + number + " natural numbers is " + sum);
		}
		else{
			// Displaying the result the number is not natural number
			System.out.print("The number " + number +" is not a natural number");
		}
		
		// closing input object
		input.close();
	}
}