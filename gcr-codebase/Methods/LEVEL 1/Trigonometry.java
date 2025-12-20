import java.util.*;

public class Trigonometry{

    // method
    public static double[] calculateTrigonometricFunctions(double angle) {
        
        // degrees to radians
        double radians = Math.toRadians(angle);

        // calculate 
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // array
        double[] result = { sin, cos, tan };

        return result;
    }

    // main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // calling method
        double[] ref = calculateTrigonometricFunctions(angle);

        // displaying results
        System.out.println("Sine value : " + ref[0]);
        System.out.println("Cosine value : " + ref[1]);
        System.out.println("Tangent value : " + ref[2]);

        input.close();
    }
}
