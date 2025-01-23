import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Temperature Converter!");

        while (running) {
            System.out.println("\nChoose a conversion option:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Celsius to Kelvin");
            System.out.println("3. Fahrenheit to Celsius");
            System.out.println("4. Fahrenheit to Kelvin");
            System.out.println("5. Kelvin to Celsius");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the Temperature Converter. Goodbye!");
                running = false;
                continue;
            }

            System.out.print("Enter the temperature to convert: ");
            double temperature = scanner.nextDouble();
            double convertedTemperature;

            switch (choice) {
                case 1: // Celsius to Fahrenheit
                    convertedTemperature = (temperature * 9/5) + 32;
                    System.out.printf("%.2f°C is equal to %.2f°F\n", temperature, convertedTemperature);
                    break;

                case 2: // Celsius to Kelvin
                    convertedTemperature = temperature + 273.15;
                    System.out.printf("%.2f°C is equal to %.2fK\n", temperature, convertedTemperature);
                    break;

                case 3: // Fahrenheit to Celsius
                    convertedTemperature = (temperature - 32) * 5/9;
                    System.out.printf("%.2f°F is equal to %.2f°C\n", temperature, convertedTemperature);
                    break;

                case 4: // Fahrenheit to Kelvin
                    convertedTemperature = (temperature - 32) * 5/9 + 273.15;
                    System.out.printf("%.2f°F is equal to %.2fK\n", temperature, convertedTemperature);
                    break;

                case 5: // Kelvin to Celsius
                    convertedTemperature = temperature - 273.15;
                    System.out.printf("%.2fK is equal to %.2f°C\n", temperature, convertedTemperature);
                    break;

                case 6: // Kelvin to Fahrenheit
                    convertedTemperature = (temperature - 273.15) * 9/5 + 32;
                    System.out.printf("%.2fK is equal to %.2f°F\n", temperature, convertedTemperature);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close();
    }
}
