import java.util.*;

public class AnagramCheck {

    public static boolean isAnagram(String str1, String str2) {

        // Remove spaces and convert to lowercase
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq = new int[256]; 

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = input.nextLine();

        System.out.print("Enter second string: ");
        String s2 = input.nextLine();

        if(isAnagram(s1, s2)){
            System.out.println("The strings are anagrams.");
        } 
		else{
            System.out.println("The strings are no anagrams.");
        }

        input.close();
    }
}
