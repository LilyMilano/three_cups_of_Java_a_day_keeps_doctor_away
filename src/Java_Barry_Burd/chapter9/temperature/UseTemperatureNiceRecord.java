package Java_Barry_Burd.chapter9.temperature;

public class UseTemperatureNiceRecord {
    public static void main(String[] args) {

        TemperatureNiceRecord temp = new TemperatureNiceRecord();
        temp.display();

        temp = new TemperatureNiceRecord(2.73, TempScale.KELVIN);
        temp.display();

        /*
        Output:
        0.00 degrees CELSIUS
        2.73 degrees KELVIN
        */
    }
}
