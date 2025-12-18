import java.util.*;

public class MultiplesOfNumberWhile{
	public static void main(String args[]){
		
		// declaring a scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking user input of number
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// checking the conditions
		if(number > 1 && number <= 100){
			
			
			// declaring counter
			int counter = number - 1;
			// using while loop
			while(counter > 1){
				
				// checking divisibility
				if(number%counter == 0){
					System.out.print(counter + " ");
				}
				counter--;
			}
		}
		
		// closing scanner object
		input.close();
	}
}