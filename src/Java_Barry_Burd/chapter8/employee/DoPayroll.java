package Java_Barry_Burd.chapter8.employee;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll {
    public static void main(String[] args) throws IOException {

        Scanner diskScanner = new Scanner(new File("dataFiles\\EmployeeInfo.txt"));

        var employeeInfo = new File("dataFiles\\EmployeeInfo.txt");
        System.out.println("Looking for " + employeeInfo.getCanonicalPath());

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

    /*Note:
    diskScanner is responsible for reading the employee information from the file,
    while aScanner is responsible for processing the information for a single employee
    within the payOneEmployee method. They are both instances of the Scanner class,
    but they are used in different contexts within the code.*/
}