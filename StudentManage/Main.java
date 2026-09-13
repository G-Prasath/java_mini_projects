package StudentManage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create StudentManage Obj
        StudentManage manager = new StudentManage();

        int choice;

        do {
            System.out.println();
            System.out.println("================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("================================");

            System.out.print("Choose Option : ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n========== ADD STUDENT ==========");

                    System.out.print("Enter Student ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Course : ");
                    String course = sc.nextLine();

                    System.out.print("Enter Student Marks : ");
                    double marks = sc.nextDouble();

                    sc.nextLine();

                    Student student = new Student(id, name, age, course, marks);

                    // Add Student
                    manager.addStudent(student);

                    break;
                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.println("\n========== SEARCH STUDENT ==========");

                    System.out.print("Enter Student ID : ");
                    int searchId = sc.nextInt();

                    sc.nextLine();

                    manager.searchStudent(searchId);
                    break;

                case 4:
                    System.out.println("\n========== UPDATE STUDENT ==========");

                    System.out.print("Enter Student ID : ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name : ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age : ");
                    int newAge = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Course : ");
                    String newCourse = sc.nextLine();

                    System.out.print("Enter New Marks : ");
                    double newMarks = sc.nextDouble();

                    sc.nextLine();

                    manager.updateStudent(updateId, newName, newAge, newCourse, newMarks);
                    break;
                case 5:
                    System.out.println("\n========== DELETE STUDENT ==========");

                    System.out.print("Enter Student ID : ");
                    int deleteId = sc.nextInt();

                    sc.nextLine();
                    manager.deleteStudent(deleteId);
                    break;
                case 6:
                    System.out.println("\nThank you for using Student Management System!");

                    break;
                default:
                    System.out.println("\nInvalid option!");
                    System.out.println("Please choose between 1 and 6.");
            }
        } while (choice != 6);
        sc.close();

    }
}
