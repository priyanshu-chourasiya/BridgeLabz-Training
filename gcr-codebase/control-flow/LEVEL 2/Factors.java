import java.util.*;

public class Factors{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring variable and taking its input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// finding factors using for loop
		for(int i = 1 ; i<= number; i++){
			if(number%i == 0){
				
				// displaying factors
				System.out.print(i + " ");
			}
		}
		
		// closing scanner object
		input.close();
	}
}