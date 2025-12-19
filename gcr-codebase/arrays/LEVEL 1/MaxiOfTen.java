import java.util.*;

public class MaxiOfTen{
	public static void main(String args[]){
		
		// declaring a scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring a array and varibles
		double[] arr = new double[10];
		double total = 0.0;
		int index = 0; 
		double temp;
		
		// using while infinte loop
		while(true){
			
			// taking user input
			System.out.print("Enter number : ");
			temp = input.nextDouble();
			
			// breaking loop condition
			if(temp < 1 || index > 9){
				break;
			}
			else{
				
				// assiging and incrementing
				arr[index] = temp;
				index++;
			}
		}
		
		// using for loop to do total
		for(int i = 0; i <= 9; i++){
			total += arr[i];
		}
		
		// displaying total
		System.out.print("Total is : " + total);
		// closing input
		input.close();
	}
}