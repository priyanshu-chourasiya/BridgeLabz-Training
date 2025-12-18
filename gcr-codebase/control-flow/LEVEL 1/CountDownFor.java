import java.util.*;

public class CountDownFor{
	public static void main(String args[]){
		
		// declaring a Scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking user input of counter
		System.out.print("Enter number : ");
		int counter = input.nextInt();
		
		// reverse printing the numbers using for loop
		for(int i = counter; i >= 1; i--){
			System.out.print(i + " ");
		}
		
		// closing scanner object
		input.close();
	}
}