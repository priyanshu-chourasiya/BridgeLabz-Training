import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // input
        System.out.print("Enter date (yyyy-mm-dd): ");
        String dateInput = input.nextLine();

        LocalDate date = LocalDate.parse(dateInput);

        // Add 7 d, 1 m, and 2 y
        LocalDate updatedDate = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        updatedDate = updatedDate.minusWeeks(3);
		
        System.out.println("Final date after calculations: " + updatedDate);

        input.close();
    }
}
