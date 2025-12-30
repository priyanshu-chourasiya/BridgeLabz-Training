/*
Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.Scanner;

public class LibraryReminder{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int finePerDay = 5;
        int totalFine = 0;

        System.out.println("Rohan Library Reminder App");

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("Book " + i);

            System.out.print("Enter Due Date : ");
            int dueDate = input.nextInt();

            System.out.print("Enter Return Date : ");
            int returnDate = input.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = (returnDate - dueDate) * finePerDay;
                totalFine += (fine);

                System.out.println("Returned late by " + lateDays + " days");
                System.out.println("Fine for this book: " + fine);
            } else {
                System.out.println("Returned on time ");
            }
        }

        System.out.println("Total Fine for all books: " + totalFine);
        input.close();
    }
}
