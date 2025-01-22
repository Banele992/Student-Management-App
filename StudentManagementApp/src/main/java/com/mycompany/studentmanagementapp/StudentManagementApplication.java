
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementApplication {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Student Management Enter (1) to launch menu or any other key to exit");
            String input = scanner.nextLine();
            if (!input.equals("1")) {
                break; // Exit the application
            }

            displayMenu();
            int choice = getChoice();
            switch (choice) {
                case 1:
                    captureNewStudent();
                    break;
                case 2:
                    searchForStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    studentReport();
                    break;
                case 5:
                    exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Capture a new student");
        System.out.println("(2) Search for a student");
        System.out.println("(3) Delete a student");
        System.out.println("(4) Print student report");
        System.out.println("(5) Exit application");
    }

    private static int getChoice() {
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            choice = -1;
        }
        return choice;
    }

    private static void captureNewStudent() {
        System.out.println("Enter the student id:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the student name:");
        String name = scanner.nextLine();

        int age;
        do {
            System.out.println("Enter the student age:");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age < 16) {
                    System.out.println("You have entered an incorrect age!! Please re-enter the student age!");
                }
            } catch (NumberFormatException e) {
                age = -1;
            }
        } while (age < 16);

        System.out.println("Enter the student email:");
        String email = scanner.nextLine();

        System.out.println("Enter the student course:");
        String course = scanner.nextLine();

        students.add(new Student(id, name, age, email, course));
        System.out.println("Student details saved");
    }

    private static void searchForStudent() {
        System.out.println("Enter the student ID to search:");
        int searchId = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == searchId) {
                found = true;
                System.out.println("Student found:");
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Age: " + student.getAge());
                System.out.println("Email: " + student.getEmail());
                System.out.println("Course: " + student.getCourse());
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudent() {
        System.out.println("Enter the student ID to delete:");
        int deleteId = Integer.parseInt(scanner.nextLine());

        boolean found = false;
        for (Student student : students) {
            if (student.getId() == deleteId) {
                found = true;
                System.out.println("Student found:");
                System.out.println("ID: " + student.getId());
                System.out.println("Name: " + student.getName());
                System.out.println("Do you want to delete this student? (yes/no)");
                String deleteChoice = scanner.nextLine().toLowerCase();

                if (deleteChoice.equals("yes")) {
                    students.remove(student);
                    System.out.println("Student deleted.");
                } else {
                    System.out.println("Student not deleted.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

 private static void studentReport() {
    if (students.isEmpty()) {
        System.out.println("No students found.");
    } else {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Student " + (i + 1));
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Student Email: " + student.getEmail());
            System.out.println("Student Course: " + student.getCourse());
            System.out.println(); // Add an additional line break between students
        }
    }
}



    private static void exitStudentApplication() {
        System.out.println("Exiting the application.");
        System.exit(0);
    }

    static void captureNewStudentInput(ArrayList<Student> students, int id, String name, int age, String email, String course) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static void searchForStudentInput(ArrayList<Student> students) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    static void deleteStudentInput(ArrayList<Student> students) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean isAgeValid(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean isAgeValid(String invalid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
