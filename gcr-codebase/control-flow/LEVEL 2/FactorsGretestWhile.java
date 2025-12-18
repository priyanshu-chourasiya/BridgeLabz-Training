import java.util.*;

public class FactorsGretestWhile{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring variable and taking its input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// declaring maxfactor variable
		int maxfactor = 0;
		
		
		// finding factors using while loop
		// declaring a counter
		int counter = 1;
		
		// using while loop
		while(counter <= number - 1){
			if(number%counter == 0){
			
				// initialzing
				maxfactor = counter;
			}
			
			// incrementing 
			counter++;
		}
		
		// displying
		System.out.print(maxfactor);
		
		
		// closing scanner object
		input.close();
	}
}