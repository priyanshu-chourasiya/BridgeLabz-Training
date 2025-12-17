import java.util.*;
public class Calculator{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		double num1 , num2;
		
		System.out.print("Enter num1 : ");
		num1 = input.nextDouble();
		System.out.print("Enter num2 : ");
		num2 = input.nextDouble();
		
		double addition,subtraction,multiplication,division;

		addition = num1 + num2;
		subtraction = num1 - num2;
		multiplication = num1 * num2;
		division = num1/num2;
		
		System.out.println("The addition, subtraction, multiplication, and division values of numbers "
            + num1 + " and " + num2 + " are: "
            + addition + ", " + subtraction + ", "
            + multiplication + " and " + division);
	}
}