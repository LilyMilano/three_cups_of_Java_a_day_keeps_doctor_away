import javax.swing.*;

public class dataEntry {
    public static void main(String[] args) {
    String value = JOptionPane.showInputDialog(null, "Enter an integer number: ");
    int decimalValue = Integer.parseInt(value);
        System.out.println("Decimal system: " + decimalValue); // Decimal system: 450

        String binarySystem = Integer.toBinaryString(decimalValue);
        System.out.println("Binary System: " + binarySystem);   // Binary System: 111000010

        String hexSystem = Integer.toHexString(decimalValue);
        System.out.println("Hexadecimal System: " + hexSystem); // Hexadecimal System: 1c2

        String octalSystem = Integer.toOctalString(decimalValue);
        System.out.println("Octal System: " + octalSystem); // Octal System: 702

        String results = "Decimal system: " + decimalValue + "\nBinary System: " + binarySystem + "\nHexadecimal System: " + hexSystem + "\nOctal System: " + octalSystem;

        JOptionPane.showMessageDialog(null, results);

    }
}
