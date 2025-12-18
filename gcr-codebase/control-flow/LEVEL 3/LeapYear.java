import java.util.*;

public class LeapYear{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring leap year varible and taking user input
		System.out.print("Enter year : ");
		int leapyear = input.nextInt();
		
		// checking conditions
		if(leapyear >= 1582){
			
			// 400 modulo
			if(leapyear%400 == 0){
				System.out.print("LeapYear");
			}
			else if(leapyear%4 ==0 && leapyear%100 != 0){
				System.out.print("LeapYear");
			}
			else{
				System.out.print("Not LeapYear");
			}
		}
		else{
				System.out.print("Not LeapYear");
			}
		
		// closing input
		input.close();
	}
}