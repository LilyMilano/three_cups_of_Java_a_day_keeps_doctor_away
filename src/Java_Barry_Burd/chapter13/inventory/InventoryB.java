package Java_Barry_Burd.chapter13.inventory;

import java.text.NumberFormat;
import java.util.Scanner;
import static java.lang.System.*;

public class InventoryB {
    public static void main(String[] args) {
        final double boxPrice = 3.25;
        final int maxBoxes = 1000;
        Scanner keyboard = new Scanner(in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        out.print("How many boxes do we have? ");
        String numBoxesIn = keyboard.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);

            if(numBoxes < 0) {
                throw new OutOfRangeException("You typed " + numBoxes + ". " +
                        "There's no such thing as a negative box.");
            }
            if(numBoxes > maxBoxes) {
                throw new NumberTooLargeException(numBoxes + " is larger than" +
                        " the maximum of " + maxBoxes);
            }

            out.println("The value is " + currency.format(numBoxes * boxPrice));

        } catch (NumberFormatException | OutOfRangeException e) {
            out.println(e.getMessage());
            out.println("Input a number from 0 to 1000.");
        } catch (Exception e) {
            out.println(e.getMessage());
        }
        out.println("That's that.");

        keyboard.close();

        /*Output:
        How many boxes do we have? 1001
        A value is out of range.
        A value is too large.
        1001 is larger than the maximum of 1000
        Input a number from 0 to 1000.
        That's that.*/
    }
}
