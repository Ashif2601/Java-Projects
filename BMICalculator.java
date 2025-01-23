import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the BMI Calculator!");

        // Input: Get weight and height from the user
        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters (m): ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display BMI
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Categorize BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        System.out.println("Thank you for using the BMI Calculator!");
        scanner.close();
    }
}
