import java.util.*;

public class CheckNum{
	
	// declaring method
	public static String checkNum(int num){
		if(num > 0){
			return "Positive";
		}
		else if(num < 0){
			return "Negative";
		}
		else{
			return "Zero";
		}
	}
	
	// main method
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter number : ");
		int num = input.nextInt();
		
		// calling method
		String result = CheckNum.checkNum(num);
		
		// displaying result
		System.out.print("Number is : " + result);
		
		input.close();
	}
	
}