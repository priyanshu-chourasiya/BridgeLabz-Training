import java.util.*;

public class CreateSubString{
	
	// method
	public static String createsubstring(String s1,int start,int end){
		
		String result = "";
		
		for(int i = start; i <= end-1; i++){
			result = result.concat(s1.charAt(i)+"");
		}
		return result;
	}
	
	// compare
	public static boolean comparecharat(String s1, String s2){
		
		if(s1.length() != s2.length()){
			return false;
		}
		for(int i = 0 ;i < s1.length(); i++){
			if(s1.charAt(i) != s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter str : ");
		String str1 = input.next();
		
		// calling 
		String result1 = CreateSubString.createsubstring(str1 , 0, 3);
		boolean result2 = CreateSubString.comparecharat(str1,result1);
		
		System.out.print(result1 + " " + result2);
		
		input.close();
	}
}