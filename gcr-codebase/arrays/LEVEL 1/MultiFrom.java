import java.util.*;

public class MultiFrom{
	public static void main(String args[]){
	// Declaring scanner class object
	Scanner input = new Scanner(System.in);
	
	// decalring varible and array
	int number;
	int[] arr = new int[4];
	
	// taking input of number
	System.out.print("Enter number : ");
	number = input.nextInt();
	
	// for loop to do multiplication and save in array
	for(int i = 6 ;i <= 9; i++){
		
		// substracting from 6 to index 
		arr[i-6] = number * i;
	}
	
	// displaying result
	for(int i = 6; i <= 9; i++){
		System.out.println(number + " * " + (i) + " = " + (i)*number);
	}
	
	// closing input
	input.close();
	}
}