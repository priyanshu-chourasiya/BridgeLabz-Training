import java.util.*;

public class SplitWord2D {

    // methods
    public static int returnlength(String str) {
        int count = 0;
        int i = 0;
        while (true) {
            try {
                str.charAt(i);
                count++;
                i++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }
	
    public static String[] tosplit(String str) {
        return str.split(" ");
    }

    public static String[][] returntwoD(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(returnlength(words[i]));
        }

        return result;
    }

    // main
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter String line : ");
        String line = input.nextLine();

        String[] words = tosplit(line);
        String[][] result = returntwoD(words);
		
        for (int i = 0; i < result.length; i++) {
            int len = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + " " + len);
        }

        input.close();
    }
}
