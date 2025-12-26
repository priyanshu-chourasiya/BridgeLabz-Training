// question : https://leetcode.com/problems/valid-palindrome/description/ 
// date : 24-12-2025

import java.util.Scanner;

class ValidPalindrome {

    public boolean isPalindrome(String s) {

        // Remove non-alphanumeric characters and convert to uppercase
        s = s.toUpperCase().replaceAll("[^A-Za-z0-9]", "");

        if (s.isEmpty()) {
            return true;
        }

        int st = 0, end = s.length() - 1;

        while (st < end) {
            if (s.charAt(st) != s.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        ValidPalindrome obj = new ValidPalindrome();
        boolean result = obj.isPalindrome(input);

        System.out.println("Is Palindrome: " + result);

        sc.close();
    }
}
