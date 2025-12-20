import java.util.*;


public class SumOfN{
	
	public static int sumofnumsrecursion(int num){
		if(num == 1){
			return 1;
		}
		else{
			return num + sumofnumsrecursion(num-1);
		}
	}
	
	public static int sumofnumiteration(int num){
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i;
		}
		return sum;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter number : ");
		int num = input.nextInt();
		
		// calling methods
		int sum1 = SumOfN.sumofnumsrecursion(num);
		int sum2 = SumOfN.sumofnumiteration(num);
		
		System.out.print(sum1 + " " + sum2);
		
		input.close();
	}
}