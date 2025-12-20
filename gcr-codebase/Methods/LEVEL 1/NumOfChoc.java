import java.util.*;

public clas NumOfChoc{
	
	// method
	public static int[] findRemainderAndQuotient(int choc, int child) {
		
		int[] arr = new arr[2];
		arr[0] = choc/child;
		aarr[1] = choc%child;
		
		return arr
		
	}
	
	// main method
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		// taking user input
		System.out.print("Enter num1 : ");
		int num1 = input.nextInt();		
		System.out.print("Enter num2 : ");
		int num2 = input.nextInt();
		
		double ref[] = NumOfChoc.reminderAndQuotient(num1,num2);
		
		System.out.println("each child : " + ref[0]);
		System.out.print("remaining : " + ref[1]);
		
		input.close();
	}
}