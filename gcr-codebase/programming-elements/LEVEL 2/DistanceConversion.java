import java.util.*;
public class DistanceConversion{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		double distanceInFeet = input.nextDouble();
		
		double distanceInMiles = 3 * 1760 * distanceInFeet;
		
		double distanceInYards = distanceInFeet * 3;
		
		System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " 
							+ distanceInMiles);
		
		input.close();
	}
}