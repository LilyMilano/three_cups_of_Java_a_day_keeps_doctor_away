package Java_Barry_Burd.chapter8.employee;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll {
    public static void main(String[] args) throws IOException {
        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt"));

        for(int empNumber = 1; empNumber <= 3; empNumber++){
            payOneEmployee(diskScanner);
        }
        diskScanner.close();
    }

    static void payOneEmployee(Scanner aScanner){
        Employee anEmployee = new Employee();

        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine();
    }
}
