import java.util.*;

public class ReturnChar{
	
	// method
	public static char[] returnChararray(String str){
		char[] result = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++){
			result[i] = str.charAt(i);
		}
		
		return result;
	}
	
	// compare two arrays
	public static boolean comparetwoarray(char arr1[], char arr2[]){
		
		if(arr1.length != arr2.length){
			return false;
		}
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter str1 : ");
		String str1 = input.next();
		System.out.print("Enter str2 : ");
		String str2 = input.next();
		
		char result1[] = ReturnChar.returnChararray(str1);
		char result2[] = ReturnChar.returnChararray(str2);
		
		boolean result = ReturnChar.comparetwoarray(result1,result2);
		System.out.print(result);
		
		input.close();
	}
}