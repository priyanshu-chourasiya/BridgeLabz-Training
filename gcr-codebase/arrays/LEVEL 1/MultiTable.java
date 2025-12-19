import java.util.*;

public class MultiTable{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring variable and taking user input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// declaring array to store table from 1 to 10
		int[] arr = new int[10];
		
		// loop to find table and storing in array
		for(int i = 0; i<= 9; ++i){
			
			// doing multiplication and storing in array
			arr[i] = (i+1) * number;
		}
		
		// displaying the result through loop
		for(int i = 0; i<= 9; ++i){
			System.out.println(number + " * " + (i + 1) + " = " + arr[i]);
		}
		
		
		// closing input
		input.close();
		
	}
}