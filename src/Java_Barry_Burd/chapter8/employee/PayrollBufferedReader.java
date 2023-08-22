package Java_Barry_Burd.chapter8.employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PayrollBufferedReader {
    public static void main(String[] args) {
        try (BufferedReader diskReader = new BufferedReader(
                new FileReader("dataFiles\\EmployeeInfo.txt"))) {

            var employeeInfo = new File("dataFiles\\EmployeeInfo.txt");
            System.out.println("Looking for " + employeeInfo.getCanonicalPath());

            for (int empNum = 1; empNum <= 3; empNum++) {
                payOneEmployee(diskReader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void payOneEmployee(BufferedReader diskReader) {
        Employee anEmployee = new Employee();

        try {
            anEmployee.setName(diskReader.readLine());
            anEmployee.setJobTitle(diskReader.readLine());
            anEmployee.cutCheck(Double.parseDouble(diskReader.readLine()));
        } catch (NumberFormatException n) {
            System.out.println("[Employee has no 'amountPaid' value]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
