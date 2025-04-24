import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;
    String department;

    Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Update Student\n0. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Enter ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter department:");
                    String department = scanner.nextLine();
                    students.add(new Student(id, name, department));
                    System.out.println("Student added!");
                    break;
                case 2:
                    System.out.println("Student List:");
                    for (Student s : students) {
                        System.out.println("ID: " + s.id + ", Name: " + s.name + ", Department: " + s.department);
                    }
                    break;
                case 3:
                    System.out.println("Enter student ID to update:");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    for (Student s : students) {
                        if (s.id == updateId) {
                            System.out.println("Enter new name:");
                            s.name = scanner.nextLine();
                            System.out.println("Enter new department:");
                            s.department = scanner.nextLine();
                            System.out.println("Student updated!");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

