/*
School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
*/

import java.util.Scanner;

public class SchoolAttendence {
    
    // main
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // declaring arrays to store attendence
        String[] students = {"A","B","C","D","E","F","G","H","I","J"};
        char[] result = new char[students.length];

        // checking attendence
        for(int i = 0; i < students.length; i++){
            System.out.print(students[i] + " - ABSENT(A) OR PRESENT(P) : ");
            char status = input.next().toUpperCase().charAt(0);
            result[i] = status;
        }
        // printing attendence
        for(int i = 0; i < result.length;i++){
            System.out.print(students[i] + " is " + (String)((result[i] == 'A') ? " ABSENT " : " PRESENT "));
            System.out.println();
        }
        input.close();
    }
}
