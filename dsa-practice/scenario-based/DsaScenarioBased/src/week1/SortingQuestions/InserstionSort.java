/*
 * SmartShelf – Real-Time Book Arrangement (Insertion Sort)
Story: In a digital library kiosk, as users add books to their reading list, the system must keep
the list sorted alphabetically by title. Since books are added one at a time and the list is
mostly sorted, Insertion Sort fits perfectly.
Key Concepts:
● Online/real-time sorting
● Efficient for nearly sorted data
● Stable sorting by title
 */

package week1.SortingQuestions;

import java.util.Arrays;

public class InserstionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {78,12,1,2,67,3,12,31,32,2,323,82,45,23,4,234,234,223,4234,234,7,89,29};
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
