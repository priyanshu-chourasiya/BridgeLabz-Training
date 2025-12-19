import java.util.*;

public class VotingAge{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring array of 10
		int[] age = new int[10];
		
		// taking user input of age
		for(int i = 0; i <= 9; i++){
		
			// taking input
			System.out.print("Enter age : ");
			age[i] = input.nextInt();
			
		}
		
		// checking eligible for vote
		for(int i = 0; i <= 9; i++){
			if(age[i] < 0){
				System.out.println("Invalid age");
			}
			else if(age[i] >= 18){
				System.out.println("The student with the age " + age[i] +" can vote");
			}
			else{
				System.out.println("The student with the age " + age[i] +" cannot vote");
			}
		}
		
		// closing scanner object
		input.close();
	}
}