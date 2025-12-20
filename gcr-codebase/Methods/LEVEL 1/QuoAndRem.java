import java.util.*;

public class QuoAndRem{
	
	// method
	public static double[] reminderAndQuotient(int num1, int num2){
		
			double arr[] = new double[2];
			arr[0] = num1%num2;
			arr[1] = num1/num2;
			
			return arr;
	}
	
	// main method
	public static void main(String agrs[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking user input
		System.out.print("Enter num1 : ");
		int num1 = input.nextInt();		
		System.out.print("Enter num2 : ");
		int num2 = input.nextInt();
		
		double ref[] = QuoAndRem.reminderAndQuotient(num1,num2);
		
		System.out.println("Reminder : " + ref[0]);
		System.out.print("quotient : " + ref[1]);
		
		input.close();
	}
}