import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200.0;

        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (or -1 to quit): ");
            int distance = sc.nextInt();

            if (distance == -1) {
                System.out.println("Journey ended by user.");
                break;
            }

            double fare = (distance <= 5) ? 20 :
                          (distance <= 15) ? 40 : 60;

            if (fare <= balance) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
            } else {
                System.out.println("Insufficient balance. Card exhausted.");
                break;
            }
        }
        sc.close();
    }
}
