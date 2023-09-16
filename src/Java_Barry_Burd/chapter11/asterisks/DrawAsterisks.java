package Java_Barry_Burd.chapter11.asterisks;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class DrawAsterisks {
    public static void main(String[] args) {

        int[] values = new int[5];

        Scanner keyboard = new Scanner(in);
        out.println("Type five numbers: ");

        for (int index = 0; index < 5; index++) {
            values[index] = keyboard.nextInt(); // Fills the array
        }

        out.println();
        out.println(Arrays.toString(values));   // Prints the resultant array
        out.println();
        //...................................................................
        // Drawing the asterisks:

        for (int index = 0; index < 5; index++) {     // Control the number of rows printed.
            for (int numAsterisks = 0; numAsterisks < values[index]; numAsterisks++) {  // Asterisks printed.
                out.print("*");  // This prints a single "*" character without a newline.
            }
            out.println();  // This prints a newline after each row is completed.
        }
        keyboard.close();
    }
}
