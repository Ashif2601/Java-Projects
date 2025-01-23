import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>(); // List to store tasks
        boolean running = true;

        System.out.println("Welcome to the Simple To-Do List!");

        while (running) {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Add a task
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added: " + task);
                    break;

                case 2:
                    // View all tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in the list!");
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    // Remove a task
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove!");
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter the number of the task to remove: ");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            String removedTask = tasks.remove(taskNumber - 1);
                            System.out.println("Task removed: " + removedTask);
                        } else {
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting the To-Do List. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option (1-4).");
            }
        }

        scanner.close(); // Close the scanner
    }
}
