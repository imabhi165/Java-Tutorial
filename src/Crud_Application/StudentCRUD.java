package Crud_Application;

import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentCRUD {
    static List<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Create\n2. Read\n3. Update\n4. Delete\n5. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> createStudent();
                case 2 -> readStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid option!");
            }
        }
    }

    static void createStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        students.add(new Student(id, name));
        System.out.println("Student added.");
    }

    static void readStudents() {
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s.id + " - " + s.name);
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student s : students) {
            if (s.id == id) {
                System.out.print("Enter new name: ");
                s.name = scanner.nextLine();
                System.out.println("Student updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        students.removeIf(s -> s.id == id);
        System.out.println("Student deleted if existed.");
    }
}
