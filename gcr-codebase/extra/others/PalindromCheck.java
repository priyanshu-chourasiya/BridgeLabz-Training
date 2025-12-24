import java.util.*;

public class PalindromCheck{
	
	// method
	public static boolean ispalindrom(String str){
		
		int st = 0, end = str.length() - 1;
		while(st < end){
			if(str.charAt(st) != str.charAt(end)){
				return false;
			}
			st += 1;
			end -= 1;
		}
		return true;
	}
	
	// main
	public static void main(String args[]){
		
		System.out.print(ispalindrom("aba"));
	}
}