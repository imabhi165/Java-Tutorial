import java.util.*;

public class StudentRecord {
    public static void main(String[] args) {
        System.out.println("Student Record Management System");
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Student ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Student Grade: ");
                String grade = scanner.nextLine();
                students.add(new Student(name, id, grade));
                System.out.println("Student added successfully.");
            } else if (choice == 2) {
                System.out.println("\nStudent Records:");
                for (Student student : students) {
                    System.out.println(student);
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
}
