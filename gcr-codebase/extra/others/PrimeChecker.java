import java.util.*;

public class PrimeChecker{
	
	// methods
	public static boolean isprime(int num){
		if(num < 2){
			return false;
		}
		int i = 2;
		while(i <= (int)Math.sqrt(num)){
			if(num%i == 0){
				return false;
			}
			i++;
		}
		return true;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int num = input.nextInt();
		
		System.out.print(isprime(num));
		
		input.close();
		
	}
}