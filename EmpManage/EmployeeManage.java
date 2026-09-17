package EmpManage;

import java.util.*;

public class EmployeeManage {

    // Initiate List
    private List<Employee> empDB;

    public EmployeeManage() {
        empDB = new ArrayList<>();
    }

    // Add
    public void addEmp(Employee addEmpdetais) {

        // Checck if already Existe
        for (Employee emp : empDB) {
            if (emp.getId() == addEmpdetais.getId()) {
                System.out.println("Employee ID already exists!");
                return;
            }
        }

        empDB.add(addEmpdetais);
        System.out.println("Employee added successfully!");
    }

    // View
    public void viewEmp() {
        if (empDB.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }

        System.out.println();
        System.out.println("========== EMPLOYEE LIST ==========");
        for (Employee dispEmp : empDB) {
            dispEmp.disaplayEmp();
        }
    }

    // Search Employee
    public void searchEmp(int id) {
        for (Employee emp : empDB) {
            if (emp.getId() == id) {
                System.out.println("Employee Found");
                emp.disaplayEmp();
                return;
            }
            System.out.println("Employee Not Found");
        }
    }

    // update
    public void updateEmp(int id,
            String name,
            int age,
            String department,
            String position,
            double salary) {

        for (Employee emp : empDB) {
            if (emp.getId() == id) {
                emp.setId(id);
                emp.setName(name);
                emp.setAge(age);
                emp.setDepartment(department);
                emp.setPosition(position);
                emp.setSalary(salary);
                System.out.println("Employee updated successfully!");
            }

            return;
        }

    }

    // Delete
    public void deleteEmp(int id) {
        for (Employee emp : empDB) {
            if (emp.getId() == id) {
                empDB.remove(id);
                System.out.println("Employee deleted successfully!");

                return;
            }
        }
        System.out.println("Employee not found!");
    }
}