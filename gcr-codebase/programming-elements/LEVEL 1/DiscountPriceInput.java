import java.util.*;
public class DiscountPriceInput{
	public static void main(String args[]){	
		
		// declaring Scanner object for input
		Scanner input = new Scanner(System.in);
		
		// taking input
		int fee = input.nextInt();
		int discountPercent = input.nextInt();
		
		// calculating discount
		int discount;
		discount = fee/discountPercent;
		
		// printing the results
		System.out.println("The discount amount is INR " + discount + 
				" and final discounted fee is INR " + (fee - discount));
	}
}