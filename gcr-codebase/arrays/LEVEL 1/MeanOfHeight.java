import java.util.*;

public class MeanOfHeight{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring an array and sum
		double[] arr = new double[11];
		int sum = 0;
		
		// taking input from user and doing sum
		for(int i = 0; i <= 10; i++){
			System.out.print("Enter number : ");
			arr[i] = input.nextDouble();
			sum += arr[i];
		}
		
		// doing the mean height
		double mean = sum/11;
		
		// printing mean height
		System.out.print("Mean height of team is : " + mean);
		
		// closing input
		input.close();
	}
}