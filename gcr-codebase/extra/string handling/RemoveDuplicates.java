import java.util.*;

public class RemoveDuplicates{
	
	// methods
	public static String removeduplicates(String str){
		
		int[] freq = new int[256];
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if(freq[ch] == 0){
				result += ch;
				freq[ch] = 1; // assingn to 1 
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String ans = input.next();
		
		System.out.print(removeduplicates(ans));
		
		input.close();
	}
	
}