package Java_Barry_Burd.chapter9.temperature;

import static java.lang.System.out;

public record TemperatureNiceRecord(double number, TempScale scale) {

    public TemperatureNiceRecord(){
        this(0, TempScale.CELSIUS);
    }
    public void display(){
        out.printf("%5.2f degrees %s%n", number, scale);
    }
}
