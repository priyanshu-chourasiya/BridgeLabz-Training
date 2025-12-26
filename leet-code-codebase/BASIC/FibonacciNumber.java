// question : https://leetcode.com/problems/fibonacci-number/description/
// date : 24-12-2025

import java.util.Scanner;

class FibonacciNumber {

    public int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        FibonacciNumber obj = new FibonacciNumber();
        int result = obj.fib(n);

        System.out.println("Fibonacci number is: " + result);

        sc.close();
    }
}
