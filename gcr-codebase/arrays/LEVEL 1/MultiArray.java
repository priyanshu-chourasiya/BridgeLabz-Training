import java.util.*;

public class MultiArray{
	public static void main(String args[]){
		
		// declaring scanner object
		Scanner input = new Scanner(System.in);
		
		// creating a user input array
		System.out.print("Enter number of rows : ");
		int r = input.nextInt();
		System.out.print("Enter number of columns : ");
		int c = input.nextInt();
		
		// declaring index
		int index = 0;
		
		// declaring 2d array
		int[][] arrm = new int[r][c];
		
		// taking input of 2d array
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				System.out.print("Enter number for : " + i + " " + j + " : " );
				arrm[i][j] = input.nextInt();
			}
		}
		
		// declaring 1d array
		int[] arr = new int[r * c];

		// copying to 1d array
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				arr[index] = arrm[i][j];
				index++;
			}
		}
		
		// displaying 1d array
		for(int i = 0; i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		// closing input
		input.close();
	}
}