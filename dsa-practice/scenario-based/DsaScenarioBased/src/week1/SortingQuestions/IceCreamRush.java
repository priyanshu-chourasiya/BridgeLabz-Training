package week1.SortingQuestions;

import java.util.Arrays;

public class IceCreamRush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,3,123,13,123,4,34,45,23,41,233,123};
		
		int n = arr.length;
		
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
