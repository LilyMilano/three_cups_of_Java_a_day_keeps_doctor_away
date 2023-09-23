package Java_Barry_Burd.chapter9.student;

public class StudentWithGrades {

    // Class fields:
    private String name;
    private int id;
    private double [] grades = new double [5];

    // Constructors
    StudentWithGrades(String name, int id, double [] grades){
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    // Getters and setters:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double[] getGrades() {
        return grades;
    }
    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    // Methods:
    double gpa = 0;
    public double getGPA() {
        for (double grade : grades) {
            gpa += grade / grades.length;
        }
        return gpa;
    }

    public void display(){
        System.out.printf("Student: %s; ID: %d; GPA: %.2f", getName(), getId(), getGPA());
        System.out.println();
    }
}
