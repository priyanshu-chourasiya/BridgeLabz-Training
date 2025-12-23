import java.util.*;

public class CountVowCons{
	
	// methods
	public static int countvovels(String str){
		int result = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' 
			|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				result += 1;
			}
		}
		return result;
	}
	public static int countconso(String str){
		int result = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != 'a' || str.charAt(i) != 'e' 
			|| str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u'){
				result += 1;
			}
		}
		return result;
	}
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String str = input.next();
		
		System.out.print(countvovels(str) + " " + countconso(str));
		
		input.close();
	}
	
}