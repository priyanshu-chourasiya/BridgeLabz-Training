package AdditionalQuestions;

public class FlipKey {

    public static boolean isValid(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                return false;
            }
        }
        return true;
    }

    public static String CleanseAndInvert(String input) {

        if (input == null || input.length() < 6) {
            return "";
        }

        if (!isValid(input)) {
            return "";
        }

        input = input.toLowerCase();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) % 2 != 0) {
                result.append(input.charAt(i));
            }
        }

        StringBuilder reversed = new StringBuilder(result).reverse();

        StringBuilder finalAns = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            if (i % 2 == 0) {
                finalAns.append(Character.toLowerCase(reversed.charAt(i)));
            } else {
                finalAns.append(reversed.charAt(i));
            }
        }

        return finalAns.toString();
    }

    public static void main(String[] args) {
        String ans = CleanseAndInvert("Aeroplane");

        if (ans.isEmpty()) {
            System.out.println("Invalid input");
        } else {
            System.out.println("The generated key is - " + ans + ".");
        }
    }
}

