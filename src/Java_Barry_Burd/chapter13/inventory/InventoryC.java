package Java_Barry_Burd.chapter13.inventory;

import java.text.NumberFormat;
import java.util.Scanner;
import static java.lang.System.*;
public class InventoryC {
    @SuppressWarnings("TryWithIdenticalCatches")
    public static void main(String[] args) {
        double boxPrice = 0.0;
        int maxBoxes = 0;
        Scanner keyboard = new Scanner(in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        try {
            out.print("What's the price per box? ");
            String boxPriceIn = keyboard.next();
            boxPrice = Double.parseDouble(boxPriceIn);
            if(boxPrice < 0.0) {
                throw new OutOfRangeException("Price per box cannot be negative.");
            }

            out.print("What's the maximum number of boxes? ");
            String maxBoxesIn = keyboard.next();
            maxBoxes = Integer.parseInt(maxBoxesIn);
            if(maxBoxes < 0) {
                throw new OutOfRangeException("Maximum number of boxes cannot" +
                        " be negative.");
            }

            out.print("How many boxes do we have? ");
            String numBoxesIn = keyboard.next();
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
        } catch (NumberFormatException e) {
            out.print(e.getMessage());
            out.println(" ...Cannot interpret the input.");
        } catch (OutOfRangeException e) {
            out.println(e.getMessage());
        } catch (Exception e) {
            out.println(e.getMessage());
        }
        out.println("That's that.");

        keyboard.close();

        /*What's the price per box? 10
        What's the maximum number of boxes? 10
        How many boxes do we have? 5
        The value is $50.00
        That's that.*/
    }
}
