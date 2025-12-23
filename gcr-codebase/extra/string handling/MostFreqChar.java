import java.util.*;

public class MostFreqChar{
	
	// method
	public static char findmostfreq(String name){
		
		int[] freq = new int[256];
		
		for(int i = 0; i < name.length(); i++){
			freq[name.charAt(i)]++;
		}
		int max = freq[0];
		char maxchar = name.charAt(0);
		
		for(int i = 0; i < freq.length; i++){
			if(freq[i] > max){
				max = freq[i];
				maxchar = (char)i;
			}
		}
		
		return maxchar;
	}
	// main
	public static void main(String args[]){
		
		System.out.print(findmostfreq("ababababckansdhouad"));
		
	}
}