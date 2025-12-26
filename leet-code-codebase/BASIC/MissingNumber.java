// question : https://leetcode.com/problems/missing-number/
// date : 24-12-2025

import java.util.Scanner;

class MissingNumber {

    public int missingNumber(int[] nums) {

        int n = nums.length;
        int sumOfArr = 0;

        for (int i = 0; i < n; i++) {
            sumOfArr += nums[i];
        }

        int sumTillN = (n * (n + 1)) / 2;
        return sumTillN - sumOfArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MissingNumber obj = new MissingNumber();
        int missing = obj.missingNumber(nums);

        System.out.println("Missing number is: " + missing);

        sc.close();
    }
}
