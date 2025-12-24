import java.util.*;

public class BmiFitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

  
        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (in meters): ");
        double height = input.nextDouble();

        // bmi
        double bmi = weight / (height * height);

        // Display BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determining BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } 
		else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("BMI Category: Normal");
        } 
		else {
            System.out.println("BMI Category: Overweight");
        }

        input.close();
    }
}
