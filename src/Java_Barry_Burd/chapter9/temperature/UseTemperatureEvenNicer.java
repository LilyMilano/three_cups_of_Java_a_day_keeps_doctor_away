package Java_Barry_Burd.chapter9.temperature;

public class UseTemperatureEvenNicer {
    public static void main(String[] args) {

        var temp = new TemperatureEvenNicer();
        temp.setNumber(70.0);
        temp.setScale(TempScale.FAHRENHEIT);
        temp.convertTo(TempScale.CELSIUS);
        temp.display();

        temp = new TemperatureEvenNicer(32.0);
        temp.convertTo(TempScale.CELSIUS);
        temp.display();

        temp = new TemperatureEvenNicer(TempScale.CELSIUS);
        temp.convertTo(TempScale.FAHRENHEIT);
        temp.display();

        temp = new TemperatureEvenNicer(2.73, TempScale.KELVIN);
        temp.display();
    }
}
