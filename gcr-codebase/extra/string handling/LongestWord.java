import java.util.*;

public class LongestWord{
	
	// methods
	public static String[] tostring(String str){
		return str.split(" ");
	}
	public static String findlongest(String str){
	
		String[] words = tostring(str);
		String max = words[0];
		for(int i = 0; i < words.length; i++){
			if(words[i].length() > max.length()){
				max = words[i];
			}
		}
		return max;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String str = input.nextLine();
		
		System.out.print(findlongest(str));
		
		input.close();
	}
}