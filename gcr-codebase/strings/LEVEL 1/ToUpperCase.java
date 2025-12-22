import java.util.*;

public class ToUpperCase{
	
	// method
	public static String converttoupper(String str){
		String result = "";
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
				ch = (char)(ch - 32);
			}
			result = result + ch;
		}
		
		return result;
	}
	
	public static boolean comparetwo(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
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
		String str = input.next();
		
		String str1 = ToUpperCase.converttoupper(str);
		System.out.println(str1);
		System.out.print(ToUpperCase.comparetwo(str,str1));
		
		input.close();
	}
}