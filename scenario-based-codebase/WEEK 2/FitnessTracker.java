/*
 Sandeep’s Fitness Challenge Tracker 
Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

public class FitnessTracker {

    public static void main(String[] args) {

        // 0 - rest
        int[] pushUps = {30, 0, 40, 25, 0, 50, 35};

        int total = 0;
        int workoutDays = 0;

        // For-each loop to calculate total and average
        for (int dailyPushUps : pushUps) {

            // Skip rest days
            if (dailyPushUps == 0) {
                continue;
            }

            total += dailyPushUps;
            workoutDays++;
        }

        double average = (workoutDays > 0) ? (double) total / workoutDays : 0;

        System.out.println("Total push-ups in the week: " + total);
        System.out.println("Workout days: " + workoutDays);
        System.out.println("Average push-ups per workout day: " + average);
    }
}
