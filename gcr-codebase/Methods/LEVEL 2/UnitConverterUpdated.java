public class UnitConverterUpdated {

    // Method 
    public static double convertYardsToFeet(double yard) {
		
        return 3 * yard;
    }
	
	public static double feetoyard(int feet){
		
		return 0.333333 * feet;
	}
	
	public static double metersToinch(int meters){
		
		return 39.3701 * meters;
	}
	
	public static double inchtometer(int inch){
		
		return 2.54 * inch;
	}
	
	

    public static void main(String[] args) {
	
        
        Scanner sc = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter yard : ");
		int yard = input.nextInt();
		System.out.print("Enter feet : ");
		int feet = input.nextInt();
		System.out.print("Enter meters : ");
		int meters = input.nextInt();
		System.out.print("Enter inch : ");
		int inch = input.nextInt();
		
		
		// calling object
		double result1 = UnitConverterUpdated.convertYardsToFeet(km);
		double result2 = UnitConverterUpdated.feetoyard(miles);
		double result3 = UnitConverterUpdated.metersToinch(meters);
		double result4 = UnitConverterUpdated.inchtometer(inch);
		
		// result
		System.out.print(result1 + " " + result2 + " " + result3 + " " + result4);
		

        sc.close();
    }
}
