import java.util.*;

public class BonusOfEmp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Arrays for 10 employees
        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter salary: ");
            double s = input.nextDouble();

            System.out.print("Enter years of service: ");
            double y = input.nextDouble();

            // Validation
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // repeat the same employee
                continue;
            }

            salary[i] = s;
            service[i] = y;
        }

        // Calculating bonus and totals
        for (int i = 0; i < 10; i++) {

            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);

        input.close();
    }
}
