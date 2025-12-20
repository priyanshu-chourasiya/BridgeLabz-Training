import java.util.*;

public class SumOFNatural{
	
	// declaring method
	public static int sumofN(int num){
		int sum = 0,i = 1;
		while(i <= num){
			sum += i;
			i++;
		}
		return sum;
	}
	
	// main method
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter number : ");
		int num = input.nextInt();
		
		// checking input
		if(num < 1){
			System.out.print("Invalid");
			System.exit(0);
		}
		
		// calling method
		int result = SumOFNatural.sumofN(num);
		
		// displaying
		System.out.print("Sum : " + result);
		
		input.close();
	}
}