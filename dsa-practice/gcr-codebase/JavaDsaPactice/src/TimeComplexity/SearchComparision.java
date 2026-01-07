package TimeComplexity;

import java.util.Arrays;
import java.util.Random;

public class SearchComparision {

    // Linear
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary S
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        Random rand = new Random();

        for (int size : datasetSizes) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = rand.nextInt(size * 10);
            }

            int target = data[rand.nextInt(size)];

            // Measure Linear Search Time
            long startTime = System.nanoTime();
            linearSearch(data, target);
            long linearTime = System.nanoTime() - startTime;

            // Sort array for Binary Search
            Arrays.sort(data);

            // Measure Binary Search Time
            startTime = System.nanoTime();
            binarySearch(data, target);
            long binaryTime = System.nanoTime() - startTime;

            System.out.printf("Dataset Size: ", size);
            System.out.printf("Linear Search Time: %.5f ms\n", linearTime / 1e6);
            System.out.printf("Binary Search Time: %.5f ms\n\n", binaryTime / 1e6);
        }
    }
}
