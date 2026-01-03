package Hashmaps;

import java.util.HashSet;

class PairWithGivenSum {

    static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int required = target - num;

            if (seen.contains(required)) {
                System.out.println("Pair found: " + num + " + " + required + " = " + target);
                return true;
            }

            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        if (!hasPair(arr, target)) {
            System.out.println("No pair found");
        }
    }
}

