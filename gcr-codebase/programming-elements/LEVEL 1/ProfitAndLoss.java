// declaring a class ProfitAndLoss to find profit and loss 
public class ProfitAndLoss{
	public static void main(String args[]){	
		
		// declaring a variable costPrice to store cost price 
		int costPrice = 129;
		
		// declaring a variable sellPrice to store selling price
		int sellPrice = 191;
		
		// declaring a profit variable which will store the profit made
		int profit;
		
		// using formula sellPrice - costPrice on profit
		profit = sellPrice - costPrice;
		
		// declaring a profitPercentage variable and finding profit percentage
		double profitPercentage = ((double)profit/(double)costPrice) * 100;
		
		// displaying the desired output
		System.out.println("The Cost Price is INR " + costPrice + 
								 " and Sellinf price is INR " + sellPrice + 
								"\nThe Profit is INR " + profit + " and the Profit percentage is " + 
								profitPercentage
								);
	}
}