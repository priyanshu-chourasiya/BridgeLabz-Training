import java.util.*;
public class SideOfSquare{
	public static void main(String args[]){
		
		// Declaring scanner object
		Scanner input = new Scanner(System.in); 
		
		// taking input
		double perimeter = input.nextDouble();
			
		// calcuations
		double side = (perimeter/4);
		
		// displaying the results
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	}
}