import java.util.*;

public class Bmi{
	public static void main(String args[]){
		
		// declaring scanner class object
		Scanner input = new Scanner(System.in);
		
		// declaring height and weight variable and taking input
		System.out.print("Enter height : ");
		double height = input.nextDouble();
		System.out.print("Enter weight : ");
		double weight = input.nextDouble();
		
		// computinf BMI
		double bmi = weight/(height * height);
		
		// printing results accordingly
		if(bmi <= 18.4){
			System.out.print("UnderWeight");
		}
		else if(bmi >= 18.5 && bmi <= 24.9){
			System.out.print("Normal");
		}
		else if(bmi >= 25.0 && bmi <= 39.9){
			System.out.print("Overdose");
		}
		else{
			System.out.print("Obese");
		}
		
		
		// closing input
		input.close();
	}
}