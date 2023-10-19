package Java_Barry_Burd.chapter12.employee;

public class Employee {
    // Fields
    private String name;
    private double score;

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    // Constructor
    public Employee(String name, double score){
        this.name = name;
        this.score = score;
    }
}
