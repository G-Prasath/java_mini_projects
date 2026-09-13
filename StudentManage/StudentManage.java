package StudentManage;

import java.util.*;

public class StudentManage {
    // Create List of Students
    private List<Student> students;

    // Constructors
    public StudentManage() {
        students = new ArrayList<>();
    }

    // add Student
    public void addStudent(Student student) {
        // Check if Already Existes
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                System.out.println("Student ID already exists!");
                return;
            }
        }

        students.add(student);
        System.out.println("Student added successfully!");
    }

    // view all Students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("\n========== STUDENT LIST ==========");

        for (Student s : students) {
            s.displayStudents();
        }
    }

    // Search Studes
    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("\nStudent found!");
                s.displayStudents();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Update Student
    public void updateStudent(
            int id,
            String name,
            int age,
            String course,
            double marks) {

        for (Student s : students) {
            if (s.getId() == id) {
                s.setId(id);
                s.setName(name);
                s.setAge(age);
                s.setCourse(course);
                s.setmarks(marks);

                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");

    }

    // Delete Student
    public void deleteStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

}
