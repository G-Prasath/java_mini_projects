package EmpManage;

public class Employee {
    
    // Employee Properties
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    // constructor
    public Employee(int id, String name, int age, String department, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    // GETTERS
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    // SETTERS

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
