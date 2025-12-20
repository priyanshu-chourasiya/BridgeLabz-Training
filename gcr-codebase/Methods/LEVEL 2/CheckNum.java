import java.util.*;

public class CheckNum{
	
	// methods
	public static boolean isevenodd(int num){
		if(num%2 == 0){
			System.out.println("Even");
			return true;
		}
		else{
			System.out.println("Odd");
			return false;
		}
	}
	public static boolean isPositiveNegative(int num){
		if(num < 0){
			System.out.println("Num is negative");
			return false;
		}
		else{
			System.out.println("Num is postive");
			return true;
		}
	}
	public static int cormpare(int num1 , int num2){
		if(num1 > num2){
			return 1;
		}
		else if(num1 < num2){
			return -1;
		}
		return 0;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = {10,20,13,45,74};
		
		for(int i = 0; i < 5; i++){
			if(CheckNum.isPositiveNegative(arr[i]) == true){
				CheckNum.isevenodd(arr[i]);
			}
			else{
				CheckNum.isPositiveNegative(arr[i]);
			}
		}
		
		input.close();
	}
	
}