import java.util.*;

public class FactorsWhile{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring variable and taking its input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// finding factors using while loop
		// declaring counter
		int counter = 1;
		while(counter <= number){
			
			// checking condition
			if(number%counter == 0){
				System.out.print(counter + " ");
			}
			
			// incrementing counter
			counter++;
		}
		
		// closing scanner object
		input.close();
	}
}