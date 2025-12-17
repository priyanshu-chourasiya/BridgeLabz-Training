import java.util.*;
public class TotalAmount{
	public static void main(String args[]){
		
		// declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// taking user input
		int unitPrice = input.nextInt();		
		int quantity = input.nextInt();
		
		// calculations
		int totalPrice = unitPrice * quantity;
		
		// displaying the results
		System.out.print("The total purchase price is INR " + totalPrice + 
						" if the quantity " + quantity + " and unit price is INR " + unitPrice);
		
		input.close();
	}
}