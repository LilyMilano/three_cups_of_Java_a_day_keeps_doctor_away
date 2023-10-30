package Java_Barry_Burd.chapter13.payroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.*;

public class DoPayroll_1 {    // Catch it soon - try-with-resources
    public static void main(String[] args) {
        out.println("Starting payroll...");
        cutCheck();
        out.println("Payroll completed");
    }

    public static void cutCheck() {
        try(Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"))){
            String name = diskScanner.nextLine();
            double amountPaid = diskScanner.nextDouble();

            out.printf("Pay to the order of %s: $%,.2f%n", name, amountPaid);
        } catch (FileNotFoundException e) {
            out.println(e.getMessage());
        }
    }

    /*Starting payroll...
    Pay to the order of Barry Burd: $5,000.00
    Payroll completed*/
}