package Java_Barry_Burd.chapter13.payroll;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import static java.lang.System.out;
public class DoPayroll_4 {
    public static void main(String[] args) {
        out.println("Starting payroll...");
        try {
            cutCheck();
            out.println("Payroll completed.");
        } catch (FileNotFoundException e) {
            out.println(e.getMessage());
        }
    }
    public static void cutCheck() throws FileNotFoundException {
        try (Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));
            Scanner diskScanner2 = new Scanner(new File("LegalInfo.txt"))) {
            String name = diskScanner.nextLine();
            double amountPaid = diskScanner.nextDouble();
            String disclaimer = diskScanner2.nextLine();

            if(disclaimer.equals("")){
                throw new NoSuchElementException();
            }

            out.printf("Pay to the order of %s: $%,.2f%n", name, amountPaid);
            out.println(disclaimer);
        } catch (FileNotFoundException e) {
            out.println("Abnormal return from the cutCheck method...");
            throw e;
        } catch (InputMismatchException e) {
            out.println("Something is formatted incorrectly in the Employee" +
                    ".txt file.");
        } catch (NoSuchElementException e) {
            out.println("No text in the LegalInfo.txt file.");
        }
    }

    /*Starting payroll...
    Pay to the order of Barry Burd: $5,000.00
    We're not responsible for anything at all.
    Payroll completed.*/
}

