package Java_Barry_Burd.chapter13.payroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.*;

public class DoPayroll {    // Catch it soon
    public static void main(String[] args) {
        out.println("Starting payroll...");
        cutCheck();
        out.println("Payroll completed");
    }

    public static void cutCheck() {
        try {
            Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));
            String name = diskScanner.nextLine();
            double amountPaid = diskScanner.nextDouble();

            out.printf("Pay to the order of %s: $%,.2f%n", name, amountPaid);
            diskScanner.close();
        } catch (FileNotFoundException e) {
            out.println(e.getMessage());
        }
    }

    /*Starting payroll...
    EmployeeInfo.txt (No such file or directory)
    Payroll completed

    Run ends with the words Payroll completed. Is that true? no.
    I should not have shielded the FileNotFoundException from the code’s main
method. Instead, I should have relayed the exception from the cutCheck method
up to the main method.

Checked and unchecked exceptions:
»»The potential throwing of a checked exception must be acknowledged
in the code.

Acknowledging an exception in the code means one of two things:
»»The statements (including any constructor or method calls) that can throw the
exception are inside a try clause. That try clause has a catch clause with a
matching exception type in its parameter list. (This scenario)

»»The statements (including any constructor or method calls) that can throw the
exception are inside a method that has a throws clause in its header. The
throws clause contains a matching exception type.
*/
}
