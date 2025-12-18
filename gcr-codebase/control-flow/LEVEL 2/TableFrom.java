import java.util.*;

public class TableFrom{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking user input
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		// printing the table using for loop from 6 to 9
		for(int i = 6 ; i <= 9; i++){
			System.out.println(number + " * " + i + " = " + number*i);
		}
		
		// closing input
		input.close();
	}
}