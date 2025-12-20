import java.util.*;

public class FootballTeam{
	
	public static int sumofelements(int[] arr){
		int sum = 0;
		for(int x : arr){
			sum += x;
		}
		return sum;
	}
	public static double fingmean(int[] arr){
		int sum = FootballTeam.sumofelements(arr);
		double mean = sum/arr.length;
		
		return mean;
	}
	public static int shortestheight(int[] arr){
		int shortest = arr[0];
		for(int x : arr){
			if(shortest > x){
				shortest = x;
			}
		}
		return shortest;
	}
	public static int tallestheight(int[] arr){
		int tallest = arr[0];
		for(int x : arr){
			if(tallest > x){
				tallest = x;
			}
		}
		return tallest;
	}
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// array
		int[] arr = new int[11];
		
		for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 101) + 150;
        }
		
		int sum = FootballTeam.sumofelements(arr);
		double mean = FootballTeam.fingmean(arr);
		int tallest = FootballTeam.tallestheight(arr);
		int shortest = FootballTeam.shortestheight(arr);
		
		System.out.print(sum + " " + mean + " " + tallest + " " + shortest);
		
		input.close();
	}
	
	
}