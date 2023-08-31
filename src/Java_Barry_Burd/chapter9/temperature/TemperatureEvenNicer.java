package Java_Barry_Burd.chapter9.temperature;

import static java.lang.System.out;

public class TemperatureEvenNicer extends TemperatureNice{
    public TemperatureEvenNicer(){
        super();
    }
    public TemperatureEvenNicer(double number){
        super(number);
    }
    public TemperatureEvenNicer(TempScale scale){
        super(scale);
    }
    public TemperatureEvenNicer(double number, TempScale scale){
        super(number, scale);
    }
    public void convertTo(TempScale newScale){
        if(getScale() == TempScale.FAHRENHEIT && newScale == TempScale.CELSIUS){
            setNumber((getNumber() - 32) * 5.0 / 9.0);
        } else if (getScale() == TempScale.CELSIUS && newScale == TempScale.FAHRENHEIT){
            setNumber(getNumber() * 9.0 / 5.0 + 32);
        }
        setScale(newScale);
    }
    public void display(){
        out.printf("%5.2f degrees %s\n", this.getNumber(), this.getScale());
    }
}

