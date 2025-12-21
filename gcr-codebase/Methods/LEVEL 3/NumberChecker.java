import java.util.*;

public class NumberChecker {

    // count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // digits in array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int index = count - 1;
        int temp = number;

        while (temp != 0) {
            digits[index--] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    // Armstrong 
    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    // largest and second largest
    public static void findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }

    // smallest and second smallest
    public static void findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + secondSmallest);
    }

    // main 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Digit count: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(number, digits));

        findLargest(digits);
        findSmallest(digits);
    }
}
