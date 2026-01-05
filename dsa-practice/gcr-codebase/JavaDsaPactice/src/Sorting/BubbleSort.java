package Sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,4,4,5,2,13,4,5,23,4};
		
		int n = arr.length;
		boolean swapped = false;
		for(int i = 0; i < n; i++) {
			swapped = false;
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swapped = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(swapped != true) break;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
