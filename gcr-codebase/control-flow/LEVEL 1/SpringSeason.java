import java.util.*;

public class SpringSeason{
	public static void main(String args[]){
		
		// Declaring a scanner clss object
		Scanner input = new Scanner(System.in);
		
		// declering month and day variables
		int month, date;
		
		// taking user input of month and day
		System.out.print("Enter month : ");
		month = input.nextInt();
		System.out.print("Enter Day : ");
		date = input.nextInt();
		
		// checking spring season
		// if 3 >= month <= 6 and (if month == 3 then date >= 20 and <= 31 if month == 6 then
		// date <= 20)
		// month 3 and 6 are edge cases because after 20-3 and before 20-6 is spring
		// so we have to explicitly check for two months
		if(month >= 3 && month <= 6){
			if(month == 3 && date >= 20 && date <= 31){
				System.out.print("Its a Spring Season");
			}
			if(month == 6 && date <= 20){
				System.out.print("Its a Spring Season");
			}
			System.out.print("Its a Spring Season");
		}
		else{
			System.out.print("Not a Spring Season");
		}
		
		// closing input object
		input.close();
	}
}