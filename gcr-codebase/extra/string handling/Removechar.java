import java.util.*;

public class Removechar{
	
	// method
	public static String removechar(String str, char ch){
		
		String result = "";
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != ch){
				result += str.charAt(i);
			}
		}
		
		return result;
	}
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String str = input.nextLine();
		
		System.out.print(removechar(str,'a'));
		
		input.close();
	}
}