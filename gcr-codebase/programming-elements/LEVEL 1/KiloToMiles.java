// declaring a class KiloToMiles indicating program's purpose
// to convert kilometers to miles
class KiloToMiles{
	public static void main(String args[]){
		
		// declaring formula to convert kilometers to miles
		// 1km = 1.6 miles
		
		// declaring a double kilo which needs to converted to miles
		double kilo = 10.8;
		
		// decalaring a miles variable which will store converted value from kilometers to miles
		double miles;
		
		// using formula to convert kilometers to miles
		miles = kilo * 1.6;
		
		// displaying the converted result
		System.out.println("The distance kilo" + " km in miles is : " + miles);
	}
}