import java.util.*;

public class LeapYear{
	
	// method 
	public static boolean isleapyear(int year){
	
		// checking conditions
		if(year >= 1582){
			
			// 400 modulo
			if(year%400 == 0){
				return true;
			}
			else if(year%4 ==0 && year%100 != 0){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}
	
	// main 
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring leap year varible and taking user input
		System.out.print("Enter year : ");
		int leapyear = input.nextInt();
		
		System.out.print(LeapYear.isleapyear(leapyear));
		
		input.close();
	}	
}