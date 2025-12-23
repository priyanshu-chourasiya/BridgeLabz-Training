import java.util.*;

public class ReplaceWord{
	
	// method
	public static String replaceword(String str, String word1, String word2){
		
		String[] words = str.split(" ");
		
		for(int i = 0;i < words.length; i++){
			if(words[i].equals(word1)){
				words[i] = word2;
			}
		}
		String result = "";
		for(int i = 0; i < words.length; i++){
			result += words[i] + " ";
		}
		
		return result;
	}
	// main
	public static void main(String args[]){
		
		System.out.print(replaceword("hi abc words priyanshu abc","abc","def"));
	}
}