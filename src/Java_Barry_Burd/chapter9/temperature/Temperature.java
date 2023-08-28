package Java_Barry_Burd.chapter9.temperature;

public class Temperature {

    // Class Fields:
    private double number;
    private TempScale scale;

    // Constructors:
    public Temperature(){
        number = 0.0;
        scale = TempScale.FAHRENHEIT;
    }
    public Temperature(double number){
        this.number = number;
        scale = TempScale.FAHRENHEIT;
    }
    public Temperature(TempScale scale){
        number = 0.0;
        this.scale = scale;
    }
    public Temperature(double number, TempScale scale){
        this.number = number;
        this.scale = scale;
    }

    // Setters and getters:
    public void setNumber(double number){
        this.number = number;
    }
    public double getNumber() {
        return number;
    }
    public void setScale(TempScale scale){
        this.scale = scale;
    }
    public TempScale getScale() {
        return scale;
    }
}
