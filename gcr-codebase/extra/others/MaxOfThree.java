import java.util.*;

public class MaxOfThree{
	
	// methods
	public static int maxofthree(int num1, int num2, int num3){
		return Math.max(num1,Math.max(num2,num3));
	}
	
	// main
	public static void main(String args[]){
		
		System.out.print(maxofthree(1,2,3));
	}
}