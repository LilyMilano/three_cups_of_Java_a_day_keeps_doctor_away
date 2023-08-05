package Fundamentals;

import java.util.Scanner;

public class dataEntryByTerminal {
    public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
        System.out.println("Enter an integer number: ");

    int decimalValue = entry.nextInt();
        System.out.println("Decimal system: " + decimalValue); // Decimal system: 450

        String binarySystem = Integer.toBinaryString(decimalValue);
        System.out.println("Binary System: " + binarySystem);   // Binary System: 111000010

        String hexSystem = Integer.toHexString(decimalValue);
        System.out.println("Hexadecimal System: " + hexSystem); // Hexadecimal System: 1c2

        String octalSystem = Integer.toOctalString(decimalValue);
        System.out.println("Octal System: " + octalSystem); // Octal System: 702

    }
}
