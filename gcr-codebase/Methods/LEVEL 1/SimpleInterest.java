import java.util.*;

public class SimpleInterest{
	
	// declaring method 
	public static double simpleInterst(int principal, int rate, int time){
		
		return (principal*rate*time)/100;
	}
	
	// main object
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter principal : ");
		int principal = input.nextInt();
		System.out.print("Enter rate : ");
		int rate = input.nextInt();
		System.out.print("Enter time : ");
		int time = input.nextInt();
		
		// calling method
		double result = SimpleInterest.simpleInterst(principal,rate,time);
		
		// displaying
		System.out.print("The Simple Interest is " + result+" for Principal " 
					+ principal+", Rate of Interest " + rate+" and Time " + time);
		
		input.close();
		
	}
}