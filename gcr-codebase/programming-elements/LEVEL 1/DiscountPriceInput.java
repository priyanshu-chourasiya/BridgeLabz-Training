
public class DiscountPriceInput{
	public static void main(String args[]){	
		
		Scanner input = new Scanner(System.in);
		
		int fee = input.nextInt();
		
		
		int discountPercent = input.nextInt();
		
		
		int discount;
		
		
		discount = fee/discountPercent;
		
		
		System.out.println("The discount amount is INR " + discount + 
				" and final discounted fee is INR " + (fee - discount));
	}
}