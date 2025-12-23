import java.util.*;

public class RockPaperScissors {

    // Methods
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        if (
            (user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))
        ) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    }
    public static void displayResults(
        String[][] gameResults,
        String[][] stats
    ) {
        System.out.println("Results:");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println(
                (i + 1) + " " +
                gameResults[i][0] + " " +
                gameResults[i][1] + " " +
                gameResults[i][2]
            );
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + " " +
                stats[i][1] + " " +
                stats[i][2]
            );
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] gameResults = new String[games][3];

        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) {
			userWins++;
			}
            if (winner.equals("Computer")){
			computerWins++;
			}
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, computerWins, games);
        displayResults(gameResults, stats);
    }
}
