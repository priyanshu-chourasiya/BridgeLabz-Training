import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter age (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                System.out.println("Election booth closed.");
                break;
            }

            if (age >= 18) {
                System.out.println("Eligible to vote.");
                System.out.println("Vote for candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                int vote = sc.nextInt();

                if (vote == 1 || vote == 2 || vote == 3) {
                    System.out.println("Vote recorded successfully.");
                } else {
                    System.out.println("Invalid vote.");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
        sc.close();
    }
}
