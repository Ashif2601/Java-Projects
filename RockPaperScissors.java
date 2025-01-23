import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playing = true;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (playing) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int userChoice = scanner.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
                continue;
            }

            // Convert user choice to string
            String userMove = getMoveName(userChoice);

            // Generate computer's choice
            int computerChoice = random.nextInt(3) + 1;
            String computerMove = getMoveName(computerChoice);

            System.out.println("You chose: " + userMove);
            System.out.println("Computer chose: " + computerMove);

            // Determine the winner
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }

        scanner.close();
    }

    // Method to get move name from choice number
    private static String getMoveName(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid";
        }
    }

    // Method to determine the winner
    private static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3) || // Rock beats Scissors
                (userChoice == 2 && computerChoice == 1) || // Paper beats Rock
                (userChoice == 3 && computerChoice == 2)) { // Scissors beats Paper
            return "You win!";
        } else {
            return "You lose!";
        }
    }
}
