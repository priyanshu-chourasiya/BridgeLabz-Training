import java.util.*;

public class PowerOfNumber{
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
		
		// using for loop to find power
		for(int i = 1; i <= power; i++){
			
			// multiplying the result by the number
			result *= number;
		}
		
		// printing the result
		System.out.print(result);
		
		
		// closing input
		input.close();
	}
}