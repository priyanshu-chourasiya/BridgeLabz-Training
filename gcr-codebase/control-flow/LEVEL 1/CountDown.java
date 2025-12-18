import java.util.*;

public class CountDown{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking user input of counter
		System.out.print("Enter number : ");
		int counter = input.nextInt();
		
		// declaring coundown variable
		int i = counter; // initialzing it to counter
		
		// using while loop
		while(i >= 1){
			System.out.print(i + " ");
			i--;
		}
		
		// closing scanner object
		input.close();;
	}
}