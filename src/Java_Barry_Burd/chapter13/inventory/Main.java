package Java_Barry_Burd.chapter13.inventory;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)) {
            String[] words = new String[5];

            int l = 0;
            do {
                if (l >= 5) {
                    out.println("Maximum limited reached.");
                    break;
                }
                words[l] = keyboard.next();
                l++;
            } while (!words[l - 1].equalsIgnoreCase("Quit"));

            for (int j = 0; j < l - 1; j++) {
                out.println(words[j].length());
            }
        } catch (Exception e) {
            out.print(e.getMessage());
            out.println(" ... Cannot interpret the input.");
        }
    }
}
