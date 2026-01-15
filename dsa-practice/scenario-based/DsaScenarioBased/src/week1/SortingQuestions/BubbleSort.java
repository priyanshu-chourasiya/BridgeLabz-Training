/*
 * HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records
 */
package week1.SortingQuestions;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {78,12,1,2,67,3,12,31,32,2,323,82,45,23,4,234,234,223,4234,234,7,89,29};
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			//boolean swapped = false;
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					//swapped = true;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}


