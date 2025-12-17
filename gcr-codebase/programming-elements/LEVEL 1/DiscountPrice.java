// declaring a class DiscountPrice to find discout price of a university
public class DiscountPrice{
	public static void main(String args[]){	
		// declaring a variable fee to store university's fee
		int fee = 125000;
		
		// declaring a variable discountPercent to store discount percent in it
		int discountPercent = 10;
		
		// declaring a variable discount to store discount amount
		int discount;
		
		// using discount formula to calculate discount
		discount = fee/discountPercent;
		
		// displaying the result
		System.out.println("The discount amount is INR " + discount + 
				" and final discounted fee is INR " + (fee - discount));
	}
}