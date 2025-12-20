import java.util.*;

public class SpringSeason{
	
	// declaring method
	public static boolean checkSeason(int month, int date){
	
		// checking spring season
		// if 3 >= month <= 6 and (if month == 3 then date >= 20 and <= 31 if month == 6 then
		// date <= 20)
		// month 3 and 6 are edge cases because after 20-3 and before 20-6 is spring
		// so we have to explicitly check for two months
		if(month >= 3 && month <= 6){
			if(month == 3 && date >= 20 && date <= 31){
				return true;
			}
			if(month == 6 && date <= 20){
				return true;
			}
			return true;
		}
		else{
			return false;
		}
	}
	
	// main method
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// declering month and day variables
		int month, date;
		
		// taking user input of month and day
		System.out.print("Enter month : ");
		month = input.nextInt();
		System.out.print("Enter Day : ");
		date = input.nextInt();
		
		// calling method
		boolean result = SpringSeason.checkSeason(month,date);
		
		// displaying
		if(result == true){
			System.out.print("Its a spring season");
		}
		else{
			System.out.print("Not a spring season");
		}
		
		input.close();
	}
}