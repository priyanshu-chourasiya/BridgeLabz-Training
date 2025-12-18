import java.util.*;

public class MultiplesOfNumber{
	public static void main(String args[]){
		
		// declaring a scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking user input of number
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		if(number > 1 && number <= 100){
			for(int i = 100; i >= 1; i--){
				if(number%i == 0){
					System.out.print(i + " ");
				}
			}
		}
		
		// closing scanner object
		input.close();
	}
}