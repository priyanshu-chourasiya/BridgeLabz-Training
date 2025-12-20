import java.util.*;

public class ValidAge{
	
	// method
	public static boolean canstudentvote(int age){
		if(age >= 18){
			return true;
		}
		return false;
	}
	
	// main
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// array
		int[] arr = new int[10];
		
		// taking loop
		for(int i = 0; i < 10; i++){
			System.out.print("Enter age : ");
			arr[i] = input.nextInt();
			if(ValidAge.canstudentvote(arr[i]) == true){
				System.out.println("TRUE");
			}
			else{
				System.out.println("FALSE");
			}
		}
		
		// display
		//for(int i = 0; i < 10; i++){
		//	if(ValidAge.canstudentvote(arr[i]) == true){
		//		System.out.println("TRUE");
		//	}
		//	else{
		//		System.out.println("FALSE");
		//	}
		//}
		
		input.close();
	}
}