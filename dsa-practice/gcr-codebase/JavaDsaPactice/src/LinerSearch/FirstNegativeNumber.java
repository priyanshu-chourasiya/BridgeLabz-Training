package LinerSearch;

public class FirstNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,21,-1,3,1,3,1};
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] < 0) {
				System.out.println(i + " " + arr[i]);
			}
		}
	}

}
