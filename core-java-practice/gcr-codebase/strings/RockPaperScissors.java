import java.util.*;

public class RockPaperScissors {

    // Method choice
    static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "Rock";
        if (choice == 1) return "Paper";
        return "Scissors";
    }

    // Method to find winner
    static String findWinner(String user, String computer) {

        if (user.equals(computer))
            return "Draw";

        if (user.equals("Rock") && computer.equals("Scissors") ||
            user.equals("Paper") && computer.equals("Rock") ||
            user.equals("Scissors") && computer.equals("Paper"))
            return "User";

        return "Computer";
    }

    // Method to calculate win stats
    static String[][] calculateStats(int userWins, int compWins, int games) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent);

        return stats;
    }

    // Method to display results
    static void displayResults(String[][] gameData, String[][] stats) {

        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("-------------------------------------");

        for (int i = 0; i < gameData.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameData[i][0] + "\t" +
                    gameData[i][1] + "\t\t" +
                    gameData[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWin %");
        System.out.println("----------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] gameData = new String[games][3];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;

            gameData[i][0] = userChoice;
            gameData[i][1] = computerChoice;
            gameData[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(gameData, stats);

        sc.close();
    }
}
