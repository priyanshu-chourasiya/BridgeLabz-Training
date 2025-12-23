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
	
	public static boolean ispalindromrecursion(String str,int st,int end){
		if(st >= end){
			return true;
		}
		if(str.charAt(st) != str.charAt(end)){
			return false;
		}
		return ispalindromrecursion(str,st + 1,end - 1);
	}
	// main
	public static void main(String args[]){
		
		String str = "abcba";
		
		System.out.println(ispalindrom(str));
		
		int st = 0, end = str.length() - 1;
		
		System.out.println(ispalindromrecursion(str,st,end));
	}
}