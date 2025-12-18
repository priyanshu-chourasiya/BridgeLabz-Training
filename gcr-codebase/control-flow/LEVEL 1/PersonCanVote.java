import java.util.*;

public class PersonCanVote{
	public static void main(String args[]){
		
		// Declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking user input of age
		System.out.print("Enter your age : ");
		int age = input.nextInt();
		
		// checking the age is above 17 or not
		if(age > 17){
			System.out.print("The person's age is " + age +" and can vote.");
		}
		else{
			System.out.print("The person's age is " + age+" and cannot vote.");
		}
		
		// closing input 
		input.close();
	}
}