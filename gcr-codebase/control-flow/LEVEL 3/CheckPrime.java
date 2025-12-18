import java.util.*;

public class CheckPrime{
	public static void main(String args[]){
		
		// declaring a scanner object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking user input 
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// checking prime
		// declaring counter
		int counter = 2;
		//declaring flag
		boolean flag = true;
		
		
		// using while loop
		while(counter < number){
			
			// checking divisibility
			if(number%counter == 0){
				flag = false;
				break;
			}
			// incrementing counter
			counter++;
		}
		
		// checking the loop result
		System.out.print(flag);
		
		
		// closing scanner object
		input.close();
	}
}