import java.util.*;

public class ReverseString{
	
	// method
	public static String reversestr(String str){
		
		String temp = "";
		for(int i = str.length() - 1; i >= 0;i--){
			temp = temp.concat(str.charAt(i) + "");
		}
		return temp;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter str : ");
		String str = input.next();
		
		System.out.print(reversestr(str));
		
		input.close();
	}
}