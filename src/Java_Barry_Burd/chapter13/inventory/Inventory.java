package Java_Barry_Burd.chapter13.inventory;
import java.text.NumberFormat;
import java.util.Scanner;
import static java.lang.System.out;
public class Inventory {
    public static void main(String[] args) {
        final double boxPrice = 3.25;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        out.print("How many boxes do we have? ");
        String numBoxesIn = keyboard.next();

        try{
            int numBoxes = Integer.parseInt(numBoxesIn);
            out.print("The value is ");
            out.println(currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            // out.print(e.getMessage());
            // out.println(" ... Cannot interpret the input.");
            e.printStackTrace();
        }
        keyboard.close();
    }
}
