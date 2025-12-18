import java.util.*;

public class BonusOfEmp{
	public static void main(String args[]){
		
		// declaring a scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring and taking userinput salary and years of serive
		System.out.print("Enter salary : ");
		int salary = input.nextInt();
		System.out.print("Enter years of service : ");
		int yearsOfService = input.nextInt();
		
		// yearsOfService > 5 the 5% bonus
		// checking yearsOfService of a employee
		if(yearsOfService > 5){
			
			// computing the bonus
			double bonus = salary * 0.05;
			
			System.out.print("Bonus : " + bonus);
			
		}
		else{
			System.out.print("Not eligible for bonus");
		}
		
		// closing input
		input.close();
	}
}