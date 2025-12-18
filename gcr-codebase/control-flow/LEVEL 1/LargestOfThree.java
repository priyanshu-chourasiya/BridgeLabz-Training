import java.util.*;

public class LargestOfThree{
	public static void main(String args[]){
		
		// Decalaring scanner object
		Scanner input = new Scanner(System.in);
		
		// declaring three variables
		int num1, num2, num3;
		
		// taking user input of three variables
		System.out.print("Enter num1 : ");
		num1 = input.nextInt();
		System.out.print("Enter num2 : ");
		num2 = input.nextInt();
		System.out.print("Enter num3 : ");
		num3 = input.nextInt();
		
		// checking the largest number among three
		if(num1 >= num2 && num1 >= num3){
			System.out.print("Is the first number the largest? " + true);
			System.out.print("Is the second number the largest " + false);
			System.out.print("Is the third number the largest? " + false);
		}
		else if(num2 >= num1 & num2 >= num3){
			System.out.print("Is the first number the largest? " + false);
			System.out.print("Is the second number the largest " + true);
			System.out.print("Is the third number the largest? " + false);
		}
		else{
			System.out.print("Is the first number the largest? " + false);
			System.out.print("Is the second number the largest " + false);
			System.out.print("Is the third number the largest? " + true);
		}
		
		// closing scanner object
		input.close();
	}
}