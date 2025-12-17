import java.util.*;
public class QuotientAndReminder{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		
		int num2 = input.nextInt();
		
		double quotient = num1/num2;
		
		int reminder = num1%num2;
		
		System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + 
						" of two number " + num1 + " and " + num2);
		
		input.close();
	}
}