/*
 * FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization

 */
package week2.SortingQuestions;

public class FlashDealz {

	static void quickSort(int[] arr,int low,int high) {
		if(low < high) {
			int pivotindex = partition(arr,low,high);
			quickSort(arr,low,pivotindex-1);
			quickSort(arr,pivotindex + 1, high);
		}
	}
	
	static int partition(int[] arr,int low,int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j< high;j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,2,32,1,23,24,345,4,564,53};
		quickSort(arr,0,arr.length-1);
		
		for(int n : arr) {
			System.out.print(" " + n);
		}
	}

}
