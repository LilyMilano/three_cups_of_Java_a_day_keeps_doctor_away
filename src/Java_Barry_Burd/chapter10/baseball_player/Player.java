package Java_Barry_Burd.chapter10.baseball_player;
import java.text.DecimalFormat;

public class Player {

    // Declaration of the Fields:
    private String name;
    private double average;

    // Constructor:
    public Player(String name, double average){
        this.name = name;
        this.average = average;
    }

    // Getters:
    public String getName() {
        return name;
    }
    public double getAverage() {
        return average;
    }

    // Method:
    public String getAverageString(){
        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);
        return decFormat.format(average);
    }
}
