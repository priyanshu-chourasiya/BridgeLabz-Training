import java.util.*;

public class PowerOfNumberWhile{
	public static void main(String args[]){
		
		// declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// declaring two variables and taking their input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		System.out.print("Enter power : ");
		int power = input.nextInt();
		
		// creating a variable result with 1
		int result = 1 ;
		
		// using while loop to find power
		// declaring counter 
		int i = 1;
		while(i <= power){
			
			// multiplying the result by the number
			result *= number;
			
			// increment
			i++;
		}
		
		// printing the result
		System.out.print(result);
		
		
		// closing input
		input.close();
	}
}