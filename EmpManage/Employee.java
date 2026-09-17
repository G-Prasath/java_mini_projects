package EmpManage;

public class Employee {

    // Employee Properties
    private int id;
    private String name;
    private int age;
    private String department;
    private String position;
    private double salary;

    // constructor
    public Employee(int id, String name, int age, String department, String position, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition(){
        return position;
    }

    public double getSalary() {
        return salary;
    }

    // SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position){
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void disaplayEmp() {
        System.out.println("--------------------------------");
        System.out.println("Employee ID   : " + id);
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Department    : " + department);
        System.out.println("Position      : " + position);
        System.out.println("Salary        : " + salary);
        System.out.println("--------------------------------");
    }
}
