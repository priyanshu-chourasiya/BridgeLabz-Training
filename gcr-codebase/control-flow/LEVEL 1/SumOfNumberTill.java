import java.util.*;

public class SumOfNumberTill{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring varible sum
		int sum = 0,number;
		
		// using infinite while loop to do user input sum
		while(true){
			
			// taking input
			System.out.print("Enter number : ");
			number = input.nextInt();
			
			// checking number is != 0 and < 0 (not negative)
			if(number < 1){
				break;
			}
			else{
				// doing sum
				sum += number;
			}
		}
		
		// Displaying the result
		System.out.print("Sum is : " + sum);
		
		// closing scanner object
		input.close();
	}
}