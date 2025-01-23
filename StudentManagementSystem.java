import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean running = true;

        System.out.println("Welcome to the Student Management System!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search for a Student");
            System.out.println("4. Delete a Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = scanner.nextInt();

                    students.add(new Student(id, name, age));
                    System.out.println("Student added successfully!");
                    break;

                case 2: // View All Students
                    System.out.println("\nList of Students:");
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student student : students) {
                            student.displayStudent();
                        }
                    }
                    break;

                case 3: // Search for a Student
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;

                    for (Student student : students) {
                        if (student.id == searchId) {
                            System.out.println("\nStudent Found:");
                            student.displayStudent();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: // Delete a Student
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean deleted = false;

                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id == deleteId) {
                            students.remove(i);
                            System.out.println("Student deleted successfully!");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5: // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
