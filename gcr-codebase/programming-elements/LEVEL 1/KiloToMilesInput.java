// importing util package to take imput from user
import java.util.*;

// declaring a class KiloToMilesInput to covvert kilometers to meters
public class KiloToMilesInput{
	public static void main(String args[]){
		// declaring a variable to store kilometers value
		double kilometers;
		
		// creating scanner class object to take input
		Scanner input = new Scanner(System.in);
		
		// taking input of kilometers
		kilometers = input.nextDouble();
		
		// declaring a variable toMiles to convert kilometers to miles
		double toMiles;
		
		// converting kilometers to miles
		toMiles = kilometers * 1.6;
		
		// displaying result
		System.out.println("The total miles is " + toMiles +  " mile for the given " + kilometers + " km");
		
		input.close();
	}
}