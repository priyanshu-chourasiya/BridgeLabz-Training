import java.util.*;
public class DivisibleByFive{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring number variable and taking its input
		int number = input.nextInt();
		
		// checking number's divisibility by 5
		if(number % 5 == 0){
			System.out.println("Is the number " + number + " divisible by 5? " + true);
		}
		else{
			System.out.println("Is the number " + number + " divisible by 5? " + false);
		}
	}
}