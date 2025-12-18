import java.util.*;

public class CheckNumber{
	public static void main(String args[]){
		
		// Declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// decaring and taking user input number
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// checking the number
		if(number > 0){
			System.out.print("positive");
		}
		else if(number < 0){
			System.out.print("negative");
		}
		else{
			System.out.print("zero");
		}
		
		// closing scanner object
		input.close();
	}
}