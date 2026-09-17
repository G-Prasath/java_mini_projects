package EmpManage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Obj
        EmployeeManage manager = new EmployeeManage();

        int choice;

        do {
            // Display menu
            System.out.println();
            System.out.println("====================================");
            System.out.println("      EMPLOYEE INFORMATION SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("====================================");

            System.out.print("Choose Option : ");
            choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("========== ADD EMPLOYEE ==========");

                    System.out.print("Enter Employee ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Department : ");
                    String department = sc.nextLine();

                    System.out.print("Enter Position : ");
                    String position = sc.nextLine();

                    System.out.print("Enter Salary : ");
                    double salary = sc.nextDouble();

                    sc.nextLine();

                    Employee employee = new Employee(id, name, age, department, position, salary);
                    manager.addEmp(employee);
                    break;
                case 2:
                    manager.viewEmp();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("========== SEARCH EMPLOYEE ==========");

                    System.out.print("Enter Employee ID : ");
                    int searchId = sc.nextInt();

                    sc.nextLine();
                    manager.searchEmp(searchId);
                    break;

                case 4:
                    System.out.println();
                    System.out.println("========== UPDATE EMPLOYEE ==========");

                    System.out.print("Enter Employee ID : ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name : ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age : ");
                    int newAge = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Department : ");
                    String newDepartment = sc.nextLine();

                    System.out.print("Enter New Position : ");
                    String newPosition = sc.nextLine();

                    System.out.print("Enter New Salary : ");
                    double newSalary = sc.nextDouble();

                    sc.nextLine();

                    manager.updateEmp(updateId, newName, newAge, newDepartment, newPosition, newSalary);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("========== DELETE EMPLOYEE ==========");

                    System.out.print("Enter Employee ID : ");
                    int deleteId = sc.nextInt();

                    sc.nextLine();

                    manager.deleteEmp(deleteId);
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Thank you for using Employee Information System!");
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid option!");
                    System.out.println("Please choose between 1 and 6.");
                    break;
            }

        } while (choice != 6);
        sc.close();
    }

}