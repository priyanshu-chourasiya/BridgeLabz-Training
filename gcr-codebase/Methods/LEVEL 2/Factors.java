import java.util.*;

public class Factors{
	
	// method
	public static int[] findFactors(int num){
		
		int count = 0;
		int i = 1;
		while(i <= num){
			if(num%i == 0){
				count++;
			}
			i++;
		}
		int[] arr = new int[count];
		i = 1;
		int index = 0;
		while(i <= num){
			if(num % i == 0){
				arr[index] = i;
				index++;
			}
			i++;
		}
		
		return arr;
	}
	
	public static int sumOfFactors(int[] arr){
		int sum = 0;
		for(int i =0; i < arr.length; i++){
			sum += arr[i];
		}
		
		return sum;
	}
	
	public static int prodOfFactors(int[] arr){
		int prod = 1;
		for(int i =0; i < arr.length; i++){
			prod *= arr[i];
		}
		
		return prod;
	}
	
	public static int sumOfFactorsSq(int[] arr){
		int sum = 0;
		for(int i =0; i < arr.length; i++){
			sum += (int)Math.pow(arr[i],2);
		}
		
		return sum;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter num : ");
		int num = input.nextInt();
		
		int[] fact = Factors.findFactors(num);
		int sumoffactors = Factors.sumOfFactors(fact);
		int prodoffactors = Factors.prodOfFactors(fact);
		int sumoffactorssq = Factors.sumOfFactorsSq(fact);
		
		System.out.print(sumoffactors + " " + prodoffactors + " " + sumoffactorssq);
		
		input.close();
	}
	
}