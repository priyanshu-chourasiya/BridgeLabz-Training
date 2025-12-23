import java.util.*;

public class Palindrom{
	
	// methods
	public static boolean ispalindrom(String str){
		
		int st = 0, end = str.length() - 1;
		while(st < end){
			if(str.charAt(st) != str.charAt(end)){
				return false;
			}
			st++;
			end--;
		}
		return true;
	}
	
	// main
	public static void main(String args[]){
		
		String str = "abcba";
		
		System.out.println(ispalindrom(str));
	}
}