import java.util.*;

public class TextToWords{
	
	// methods
	public static String[] texttowords(String str){
		return str.split(" ");
	}
	
	public static int shortest(String[] words){
		
		int result = words[0].length();
		for(int i = 0; i < words.length; i++){
			if(words[i].length() < result){
				result = words[i].length();
			}
		}
		return result;
	}
	public static int longest(String[] words){
		
		int result = words[0].length();
		for(int i = 0; i < words.length; i++){
			if(words[i].length() > result){
				result = words[i].length();
			}
		}
		return result;
	}
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
	
		//input
		System.out.print("Enter str : ");
		String str = input.nextLine();
		
		String[] ans = TextToWords.texttowords(str);
		
		int shor = TextToWords.shortest(ans);
		int longe = TextToWords.longest(ans);
		
		System.out.print(shor + " " + longe);
	
		input.close();
	}
}