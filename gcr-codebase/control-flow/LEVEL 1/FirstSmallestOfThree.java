import java.util.*;

public class FirstSmallestOfThree{
	public static void main(String args[]){
		
		// Declaring Scanner class object
		Scanner input = new Scanner(System.in);
		
		// Declaring 3 int variables
		int num1, num2, num3;
		
		// taking userinput of three variables
		System.out.print("Enter num1 : ");
		num1 = input.nextInt();
		System.out.print("Enter num2 : ");
		num2 = input.nextInt();
		System.out.print("Enter num3 : ");
		num3 = input.nextInt();
		
		// finding smallest among thee numbers is num1?
		if(num1 < num2 && num1 < num3){
			System.out.print("Is the first number the smallest? " + true);
		}
		else{
			System.out.print("Is the first number the smallest? " + false);
		}
		
		// closing input
		input.close();
	}
}