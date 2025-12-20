import java.util.*;

public class Youngtall{

	public static int tallest(int[] height){
		int tallest = height[0];
		for(int i = 0; i < 3; i++){
			if(height[i] > tallest){
				tallest = height[i];
			}
		}
		return tallest;
	}
	
	public static int youngest(int[] age){
		int youngest = age[0];
		for(int i = 0; i < 3; i++){
			if(age[i] < youngest){
				youngest = age[i];
			}
		}
		return youngest;
	}
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// declaring arrays
		int[] height = new int[3];
		int[] age = new int[3];
		
		// taking input
		for(int i = 0; i < 3; i++){
			System.out.print("Enter age for : "  + i);
			int a = input.nextInt();
			System.out.print("Enter height for : " + i);
			int h = input.nextInt();
			
			height[i] = a;
			age[i] = h;
			
		}
		// finding youngest and tallest
		int youngest = Youngtall.youngest(age);
		int tallest  = Youngtall.tallest(height);
		
		//displaying
		System.out.println(youngest);
		System.out.println(tallest);
		
		
		input.close();
	}	
}