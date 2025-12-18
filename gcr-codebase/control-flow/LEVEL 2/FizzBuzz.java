import java.util.*;

public class FizzBuzz{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking user input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// checking number is postive
		if(number <= 0){
			System.out.print("Enter postive number");
		}
		else{
			
			// using for loop to print 
			for(int i = 0; i <= number; i++){
			
				// checking for 5 and 3
				if(i%5 == 0 && i%3 == 0){
					System.out.println("FizzBuzz");
				}
				
				// checking for 5
				else if(i%5 == 0){
					System.out.println("Buzz");
				}
				
				// checking for 3
				else if(i%3 == 0){
					System.out.println("Fizz");
				}
				else{
				
					// printing only numbers
					System.out.println(i);
				}
			}
		}
		
		// closing scanner object
		input.close();
	}
}


