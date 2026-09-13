package StudentManage;

public class Student {
    // Student Properites
    private int id;
    private String name;
    private int age;
    private String course;
    private double mark;

    // Constructer
    public Student(int id, String name, int age, String course, double mark){
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.mark = mark;
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

    public String getCourse(){
        return course;
    }

    public double getMark(){
        return mark;
    }


}