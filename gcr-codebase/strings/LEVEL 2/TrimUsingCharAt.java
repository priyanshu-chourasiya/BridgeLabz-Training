import java.util.*;

public class TrimUsingCharAt {

   // method
    public static int[] findTrimIndexes(String str) {

        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                end = i;
                break;
            }
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + str.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // main 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter string : ");
        String text = input.nextLine();

        int[] indexes = findTrimIndexes(text);

        String customTrimmed = createSubstring(text, indexes[0], indexes[1]);
        String builtInTrimmed = text.trim();

        boolean result = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println(customTrimmed);
        System.out.println(builtInTrimmed);
        System.out.println(result);

        input.close();
    }
}
