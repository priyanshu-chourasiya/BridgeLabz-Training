// question : https://leetcode.com/problems/move-zeroes/description/
// date : 26-12-2025 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class MoveZeros {

    public void moveZeroes(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();

        // add non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                al.add(nums[i]);
            }
        }

        // add zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                al.add(nums[i]);
            }
        }

        // copy back to nums array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = al.get(i);
        }
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

        MoveZeros obj = new MoveZeros();
        obj.moveZeroes(nums);

        System.out.println("After moving zeroes: " + Arrays.toString(nums));

        sc.close();
    }
}
