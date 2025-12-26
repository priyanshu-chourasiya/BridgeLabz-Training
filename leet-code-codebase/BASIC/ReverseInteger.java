// question : https://leetcode.com/problems/reverse-integer/description/
// date : 24-12-2025

import java.util.Scanner;

class ReverseInteger {

    public int reverse(int x) {

        int rev = 0;
        boolean isNegative = x < 0;

        String stx = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(stx).reverse();

        try {
            rev = Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }

        return isNegative ? -rev : rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int x = sc.nextInt();

        ReverseInteger obj = new ReverseInteger();
        int result = obj.reverse(x);

        System.out.println("Reversed integer: " + result);

        sc.close();
    }
}
