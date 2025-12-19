import java.util.*;

public class ArrayNum{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring array of 5 int
		int[] num = new int[5];
		
		// taking user input 
		for(int i = 0; i <= 4; i++){
		
			// taking input
			System.out.print("Enter number : ");
			num[i] = input.nextInt();
			
		}
		
		// looping through the array
		for(int i = 0; i <= 4; i++){
			
			// checking number
			if(num[i] < 0){
				System.out.println(num[i] + " is negative");
			}
			else if(num[i] == 0){
				System.out.println(num[i] + " is zero");
			}
			else{
				
				// if number is positive check for even or odd
				if(num[i]%2 == 0){
					System.out.println(num[i] + " is even and positive");
				}
				else{
					System.out.println(num[i] + " is odd and positive");
				}
			}
		}
		
		// closing input
		input.close();
	}
}