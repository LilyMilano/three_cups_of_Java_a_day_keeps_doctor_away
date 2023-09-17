package Java_Barry_Burd.chapter11.weight;

import static java.lang.System.*;

public class WeightTracker {
    public static void main(String[] args) {

        double[] weight = {145.7, 148.3, 147.2, 146.2, 147.0, 148.5, 146.9};
        int day = 1;

        out.println("Day\tFluctuation");

        for (int i = 0; i < weight.length - 1; i++) {
            double fluctuation = weight[i + 1] - weight[i];
            out.printf("%d\t%9.2f %n", day++, fluctuation);
        }
        out.println();

        /*Output:
        Day	Fluctuation
        1	     2.60
        2	    -1.10
        3	    -1.00
        4	     0.80
        5	     1.50
        6	    -1.60*/

        // Enhanced for loop:............................................

        out.println("Day\tFluctuation");

        double prevWeight = weight[0];
        day = 0;

        for(double w : weight) {
            if(day > 0) {
                double fluctuation = w - prevWeight;
                out.printf("%d\t%9.2f%n", day, fluctuation);
            }
            prevWeight = w;
            day++;
        }
        /*Output:
        Day	Fluctuation
        1	     2.60
        2	    -1.10
        3	    -1.00
        4	     0.80
        5	     1.50
        6	    -1.60*/
    }
}

