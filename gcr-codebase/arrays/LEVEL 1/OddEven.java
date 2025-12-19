import java.util.*;

public class OddEven{
	public static void main(String args[]){
		
		// declaring a scanenr object
		Scanner input = new Scanner(System.in);
		
		// taking number as input
		System.out.print("Enter the number : ");
		int number = input.nextInt();
		
		// checking for natural number
		if(number < 1){
			System.out.print("Invalid number");
			System.exit(0);
		}
		
		// decalring two arrays even and odd
		int[] even = new int[number/2 + 1];
		int[] odd = new int[number/2 + 1];
		
		// index variables for even and odd
		int indexeven = 0, indexodd = 0;
		
		// using for loop to store the values in arrays
		for(int i = 1; i <= number; i++){
			if(i%2 == 0){
				even[indexeven] = i;
				indexeven++;
			}
			else{
				odd[indexodd] = i;
				indexodd++;
			}
		}
		
		// priting the arrays
		for(int i = 0; i < number/2; i++){
			System.out.println("even " + even[i]);
		}
		for(int i = 0; i < number/2; i++){
			System.out.println("odd " + odd[i]);
		}
		
		// closing input
		input.close();
	}
}