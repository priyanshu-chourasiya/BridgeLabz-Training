import java.util.*;

public class SubstringOcc{
	
	// method
	public static int countsubstring(String str, String substr){
		int count = 0;
		int sublength = substr.length();
		
		for(int i = 0; i <= str.length() - sublength; i++){
			if(str.substring(i,i+sublength).equals(substr)){
				count++;
			}
		}
		
		return count;
	} 
	
	public static void main(String args[]){
		
		System.out.print(countsubstring("abcdefabab","ab"));
	}
}