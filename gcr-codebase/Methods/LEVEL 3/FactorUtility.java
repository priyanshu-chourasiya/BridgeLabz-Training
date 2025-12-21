import java.util.*;

public class FactorUtility {

    //factors
    public static int[] findFactors(int number) {

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
		
        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    //greatest factor
    public static int greatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;

        for (int f : factors) {
            if (f > greatest) {
                greatest = f;
            }
        }
        return greatest;
    }

    // sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;

        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;

        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    //product of cube of factors
    public static long productOfCubes(int[] factors) {
        long product = 1;

        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
    }
}
