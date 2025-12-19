import java.util.*;

public class ReverseNumber{
	public static void main(String agrs[]){
		
		Scanner input = new Scanner(System.in);
		
		// taking input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// finding counts of digits
		int count = 0;
		int temp = number;
		while(number != 0){
			count++;
			number /= 10;
		}
		number = temp;
		
		// array to store the digits
		int[] arr = new int[count];
		
		// storing in arr
		int idx = 0;
		while(number != 0){
			arr[idx] = number%10;
			idx++;
			number /= 10;
		}
		
		// displaying array
		for(int i = 0; i < count; i++){
			System.out.print(arr[i] + " ");
		}
		
		input.close();
	}
}