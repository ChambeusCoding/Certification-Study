
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n===== Student Management Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. View Students");
            System.out.println("0. Exit");
        
            System.out.print("Enter choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> updateStudent();
                case 3 -> viewStudents();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Exiting program...");
    }

    private static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        Student student = new Student(name, age, id, gpa);
        students.add(student);

        System.out.println("Student added!");
    }

    private static void updateStudent() {
        if (!students.isEmpty()) {
            // Ask for the student ID to identify the student to update
            System.out.print("Enter the student ID to update: ");
            String idToUpdate = scanner.nextLine();
            
            // Find the student with the matching ID
            Student studentToUpdate = null;
            for (Student student : students) {
                if (student.getId().equals(idToUpdate)) {
                    studentToUpdate = student;
                    break;
                }
            }
            
            studentToUpdate.setName(name);  // Updates name
            studentToUpdate.setAge(age);    // Updates age
            studentToUpdate.setGpa(gpa);    // Updates GPA
            
            if (studentToUpdate != null) {
                // Student found, now ask for new details
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
        
                System.out.print("Enter new age: ");
                int age = Integer.parseInt(scanner.nextLine());
        
                System.out.print("Enter new GPA: ");
                double gpa = Double.parseDouble(scanner.nextLine());
        
        
                System.out.println("Student updated!");
            } else {
                System.out.println("Student with ID " + idToUpdate + " not found.");
            }
        } else {
            System.out.println("No students available to update.");
        }
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
