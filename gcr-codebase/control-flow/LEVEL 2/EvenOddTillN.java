import java.util.*;

public class EvenOddTillN{
	public static void main(String args[]){
		
		// declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// decalring number and taking user input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// decalring a counter variable
		int counter = 1;
		
		// finding even and odd using while loop
		while(counter <= number){
		
			// checking the number is even or odd
			if(counter%2 == 0){
				
				// printing even
				System.out.println(counter + " is Even");
			}
			else{
			
				// printing odd
				System.out.println(counter + " is Odd");
			}
			
			// incrementing the counter
			counter++;
		}
		
		// closing scanner object
		input.close();
	}
}