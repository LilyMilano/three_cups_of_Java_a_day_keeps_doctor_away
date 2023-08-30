package Java_Barry_Burd.chapter9.temperature;

import static java.lang.System.out;

public class UseTemperatureRecord {
    public static void main(String[] args) {
        final String format = "%5.2f degrees %s\n";

        TemperatureRecord temp = new TemperatureRecord(2.73, TempScale.KELVIN);
        out.printf(format, temp.number(), temp.scale());

        // Output: 2.73 degrees KELVIN
    }
}
