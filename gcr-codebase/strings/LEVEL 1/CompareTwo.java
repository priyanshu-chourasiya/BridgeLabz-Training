import java.util.*;

public class CompareTwo{
	
	// compare
	public static boolean isEqual(String s1, String s2){
		
		for(int i = 0; i < s1.length(); i++){
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
		System.out.print("Enter string 1 : ");
		String s1 = input.next();
		System.out.print("Enter string 2 : ");
		String s2 = input.next();
		
		// calling method
		boolean result1 = CompareTwo.isEqual(s1,s2);
		System.out.println(result1);
		System.out.println(s1.equals(s2));
		
	
		input.close();
	}
	
	
}