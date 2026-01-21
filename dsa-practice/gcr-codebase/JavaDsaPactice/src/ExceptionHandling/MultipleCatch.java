package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatch{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        
        int[] arr = null;

        try {
            
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + i + ": ");
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index to retrieve: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);

        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");

        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
