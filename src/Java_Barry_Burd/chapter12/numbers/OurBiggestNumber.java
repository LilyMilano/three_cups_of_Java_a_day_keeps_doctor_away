package Java_Barry_Burd.chapter12.numbers;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;
public class OurBiggestNumber {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(85, 19, 0,
                103, 13));
        Integer maxValue = 0;

        for (Integer number : numbers) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        out.println("The biggest number is: " + maxValue);
    }
}
