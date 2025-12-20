import java.util.*;

public class FactorsOfNum{
	public static void main(String args[]){
		
		// declaring a scanner object
		Scanner input = new Scanner(System.in);
		
		// taking input of a number
		System.out.print("Enter number : ");
		int number = input.nextInt();
		int[] temp;
		
		// declaring variables and array
		int maxfactors = 10;
		int[] arr = new int[maxfactors];
		int index = 0;
		
		// finding factors 
		int j = 1;
		while(j <= number){
			if(number%j == 0){
				arr[index] = j;
				index++;
			}
			if(index == arr.length-1){
				temp = arr;
				arr= new int[temp.length*2];
				for(int i =0;i<=index;i++){
					arr[i] = temp[i];
				}
			}
			j++;
		}
		
		// displaying the array
		for(int i = 0; i < arr.length;i++){
			if(arr[i]==0){
				break;
			}
			System.out.print(arr[i] + " ");
		}
		
		// closing input
		input.close();
	}
}// git reset --soft HEAD~1
