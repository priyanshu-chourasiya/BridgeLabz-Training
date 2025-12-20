import java.util.*;

public class SmallesNLargest{
	
	// decaling largest method
	public static int largest(int num1, int num2, int num3){
		return Math.max(num1, Math.max(num2,num3));
	}
	
	// decaling smallest method
	public static int smallest(int num1, int num2, int num3){
		return Math.min(num1, Math.min(num2,num3));
	}
	
	// main method
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking user input
		System.out.print("Enter num1 : ");
		int num1 = input.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = input.nextInt();
		System.out.print("Enter num3 : ");
		int num3 = input.nextInt();
		
		// calling methods
		int result1 = SmallesNLargest.largest(num1,num2,num3);
		int result2 = SmallesNLargest.smallest(num1,num2,num3);
	
		// displaying
		System.out.println("smallest : " +  result2);
		System.out.println("largest : " +  result1);
		
		
		input.close();
	}
}