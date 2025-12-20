import java.util.*;

public class RoundsByAthlete{
	
	// method to find
	public static double noOfRounds(int side1, int side2, int side3){
		int parimeter = side1 + side2 + side3;
		double numberofrounds = 5/parimeter;
		return numberofrounds;
	}
	
	// main method
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking user input
		System.out.print("Enter lenght of side1 : ");
		int side1 = input.nextInt();
		System.out.print("Enter lenght of side2 : ");
		int side2 = input.nextInt();
		System.out.print("Enter lenght of side3 : ");
		int side3 = input.nextInt();
		
		// calling method
		double result = RoundsByAthlete.noOfRounds(side1,side2,side3);
		
		// displaying result
		System.out.print("Rounds : " + result);
		
		input.close();
	}
}