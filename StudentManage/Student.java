package StudentManage;

public class Student {
    // Student Properites
    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;

    // Constructer
    public Student(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
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

    public String getCourse() {
        return course;
    }

    public double getmarks() {
        return marks;
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

    public void setCourse(String course) {
        this.course = course;
    }

    public void setmarks(double marks) {
        this.marks = marks;
    }

    // Display Student Details
    public void displayStudents() {
        System.out.println("------------------------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
        System.out.println("markss        : " + marks);
        System.out.println("------------------------------");
    }

}