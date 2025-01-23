import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed exchange rates (example rates, you can update them as needed)
        double usdToInr = 82.50;
        double usdToEur = 0.92;
        double usdToGbp = 0.81;
        double inrToUsd = 0.0121;
        double eurToUsd = 1.09;
        double gbpToUsd = 1.23;

        boolean running = true;

        System.out.println("Welcome to the Currency Converter!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Convert USD to INR");
            System.out.println("2. Convert USD to EUR");
            System.out.println("3. Convert USD to GBP");
            System.out.println("4. Convert INR to USD");
            System.out.println("5. Convert EUR to USD");
            System.out.println("6. Convert GBP to USD");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // USD to INR
                    System.out.print("Enter amount in USD: ");
                    double usd = scanner.nextDouble();
                    System.out.println("Amount in INR: " + (usd * usdToInr));
                    break;

                case 2: // USD to EUR
                    System.out.print("Enter amount in USD: ");
                    usd = scanner.nextDouble();
                    System.out.println("Amount in EUR: " + (usd * usdToEur));
                    break;

                case 3: // USD to GBP
                    System.out.print("Enter amount in USD: ");
                    usd = scanner.nextDouble();
                    System.out.println("Amount in GBP: " + (usd * usdToGbp));
                    break;

                case 4: // INR to USD
                    System.out.print("Enter amount in INR: ");
                    double inr = scanner.nextDouble();
                    System.out.println("Amount in USD: " + (inr * inrToUsd));
                    break;

                case 5: // EUR to USD
                    System.out.print("Enter amount in EUR: ");
                    double eur = scanner.nextDouble();
                    System.out.println("Amount in USD: " + (eur * eurToUsd));
                    break;

                case 6: // GBP to USD
                    System.out.print("Enter amount in GBP: ");
                    double gbp = scanner.nextDouble();
                    System.out.println("Amount in USD: " + (gbp * gbpToUsd));
                    break;

                case 7: // Exit
                    System.out.println("Exiting the Currency Converter. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-7).");
            }
        }

        scanner.close();
    }
}
