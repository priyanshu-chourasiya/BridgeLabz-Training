import java.util.*;

public class CompareChar{
	
	// methods
	public static int comparestr(String str1, String str2){
		
		int len1 = str1.length();
		int len2 = str2.length();
		
		int minlen = Math.min(len1,len2);
		
		for(int i = 0 ; i < minlen; i++){
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			
			if(ch1 < ch2){
				return -1;
			}
			else if(ch1 > ch2){
				return 1;
			}
		}
		
		if(len1 < len2){
			return -1;
		}
		else if(len1 > len2){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        int result = comparestr(str1, str2);

        if (result < 0) {
            System.out.println("String 1 is smaller than String 2.");
        } 
		else if (result > 0) {
            System.out.println("String 1 is greater than String 2.");
        } 
		else {
            System.out.println("Both strings are equal.");
		}
		
		input.close();
	}
}