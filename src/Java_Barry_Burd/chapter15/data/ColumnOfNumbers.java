package Java_Barry_Burd.chapter15.data;

public class ColumnOfNumbers implements Displayable, Summarize{
    // Field
    double numbers[];

    // Constructor:
    public ColumnOfNumbers(double[] numbers){
        this.numbers = numbers;
    }

    // Methods:
    @Override
    public void display() {
        for(double d : numbers) {
            System.out.println(d);
        }
    }
    @Override
    public String summarize() {
        double total = 0.0;
        for(double d : numbers) {
            total += d;
        }
        return Double.toString(total);
    }
}
