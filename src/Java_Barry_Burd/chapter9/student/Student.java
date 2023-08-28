package Java_Barry_Burd.chapter9.student;

public class Student {

    // Class Fields:
    private String name;
    private int id;
    private double gpa= 0.0;
    private Major major = null;

    // Constructors:
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    public Student(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }
    public Student(String name, int id, Major major){
        this.name = name;
        this.id = id;
        this.major = major;
    }
    public Student(String name, int id, double gpa, Major major){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.major = major;
    }

    // Setters and getters:
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public void setMajor(Major major) {
        this.major = major;
    }
    public Major getMajor() {
        return major;
    }

    // Methods:
    public void display(){
        String info = "Name:"  + name + "; ";
        info += "ID:" + id + "; ";
        info += "GPA:" + ((gpa >= 0.0 && gpa <=4.0 )?gpa:"None") + "; ";
        info += "Major:" + ((major != null)?major:"None");
        System.out.println(info);
    }
}
