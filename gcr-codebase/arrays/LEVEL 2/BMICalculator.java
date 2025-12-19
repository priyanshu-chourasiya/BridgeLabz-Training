import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // number of person
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        // Arrays
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (m): ");
            height[i] = input.nextDouble();
        }

        //  BMI 
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // result
		for (int i = 0; i < n; i++) {
            System.out.printf(height[i], weight[i], bmi[i], status[i]);
        }

        input.close();
    }
}
