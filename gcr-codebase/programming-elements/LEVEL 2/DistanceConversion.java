import java.util.*;
public class DistanceConversion{
	public static void main(String args[]){
		
		// declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// taking user input
		double distanceInFeet = input.nextDouble();
		
		// calculation
		double distanceInMiles = 3 * 1760 * distanceInFeet;		
		double distanceInYards = distanceInFeet * 3;
		
		// displaying the results
		System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " 
							+ distanceInMiles);
		
		input.close();
	}
}