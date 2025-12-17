import java.util.*;
public class HeightConversion{
	public static void main(String args[]){
		
		// declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// declaring variables
		double height = input.nextDouble();
		double feet, inches;
		
		// calculating height in feet and inches
		feet = height * 12 * 2.54;
		inches = height * 2.54;

		// displaying the results
		System.out.println("Your Height in cm is " + height +
				" while in feet is " + feet +" and inches is " + inches);
		
		input.close();
	}
}