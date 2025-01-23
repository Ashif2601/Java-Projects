import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1; // Random number from 1 to 100
        int attempts = 0; // Count the number of attempts
        boolean hasWon = false; // Track if the user has guessed correctly

        while (!hasWon) {
            System.out.print("\nEnter your guess: ");

            // Read the user's guess
            int guess = scanner.nextInt();
            attempts++; // Increment the attempt counter

            // Check the user's guess
            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                hasWon = true; // Exit the loop
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close(); // Close the scanner
    }
}
