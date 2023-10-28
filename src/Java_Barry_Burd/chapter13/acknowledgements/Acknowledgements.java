package Java_Barry_Burd.chapter13.acknowledgements;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Acknowledgements {
    public static void main(String[] args) {
        Scanner diskScanner = null;
        try{
            diskScanner = new Scanner(new File("numbers.txt"));
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[] numerators = new int[5];
        int[] denominators = new int[5];

        int i = 0;
        while (diskScanner != null && diskScanner.hasNextInt() && i < numerators.length) {
            try {
                numerators[i] = diskScanner.nextInt();
                denominators[i] = diskScanner.nextInt();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Array index " + i + " is out of bounds.");
            } catch (InputMismatchException e) {
                System.out.println("Attempt to read a value that's not an " +
                        "integer");
            } catch (NoSuchElementException e) {
                System.out.println("No more elements to read from the input " +
                        "file");
                break;
            }
            i++;
        }

        int[] results = new int[numerators.length];
        for(int j = 0; j < numerators.length; j++) {
            try {
                results[j] = numerators[j] / denominators[j];
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero on array index " + j);
            }
        }
        System.out.println(Arrays.toString(results));    // Output: [5, 1, 3, 8, 7]
        diskScanner.close();
    }
}
