import java.util.*;

public class ToggleChar{
	
	// methods
	public static String convertOpposite(String str){
		
		String result = "";
		for(int i = 0; i < str.length(); i++){
			if((int)str.charAt(i) <= 90 && (int)str.charAt(i) >= 65){
				result = result + Character.toString(str.charAt(i)).toLowerCase();
			}
			if((int)str.charAt(i) <= 122 && (int)str.charAt(i) >= 97){
				result = result + Character.toString(str.charAt(i)).toUpperCase();
			}
			
		}
		return result;
	}
	
	// main
	public static void main(String args[]){
		
		System.out.print(convertOpposite("ABCDabcd"));
	}
}