import java.util.*;

public class SumAndCompare{
	public static void main(String args[]){
		
		// declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// taking input of number
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		// declaring variables
		int sum = 0, counter = 1;
		
		// doing the sum using while loop
		while(counter <= number){
			
			// doing the sum iteratively
			sum += counter;
			
			// incrementing counter
			counter ++;
		}
		
		// checking the sum using math formula
		// n*(n+1)/2
		
		double mathSum = (number*(number + 1))/2;
		
		// comparing both results
		if((int)mathSum == sum){
			System.out.print("Both are equal");
		}
		else{
			System.out.print("Both are not equal");
		}
		
		// clsoing scanner object
		input.close();
	}
}