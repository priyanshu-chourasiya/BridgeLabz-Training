import java.util.*;

public class FactorsGretest{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring variable and taking its input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// declaring maxfactor variable
		int maxfactor = 0;
		
		
		// finding factors using for loop
		for(int i = 1 ; i<= number - 1; i++){
			if(number%i == 0){
				
				// initializing
				maxfactor = i;
			}
		}
		// displying
		System.out.print(maxfactor);
		
		
		// closing scanner object
		input.close();
	}
}