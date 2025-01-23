import java.util.Scanner; // Import Scanner for user input

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");

        // Loop to allow multiple calculations
        while (true) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt(); // Get user's choice

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break; // Exit the loop
            }

            // Ask for numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble(); // Get the first number

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble(); // Get the second number

            // Perform calculation based on user's choice
            switch (choice) {
                case 1: // Addition
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2: // Subtraction
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3: // Multiplication
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4: // Division
                    if (num2 != 0) { // Prevent division by zero
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
