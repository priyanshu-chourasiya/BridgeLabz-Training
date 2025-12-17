import java.util.*;
public class HeightConversion{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		double height = input.nextDouble();
		
		double feet, inches;
		
		feet = height * 12 * 2.54;
		
		inches = height * 2.54;
		
		System.out.println("Your Height in cm is " + height +
				" while in feet is " + feet +" and inches is " + inches);
		
		input.close();
	}
}