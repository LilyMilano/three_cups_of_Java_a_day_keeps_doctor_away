package Java_Barry_Burd.chapter8.employee;

public class PartTimeEmployee extends Employee{

    // Class field:
    private double hourlyRate;

    // Set and Get:
    public void setHourlyRate(double rateIn) {
        this.hourlyRate = rateIn;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    // Methods:

    public double findPaymentAmount(int hours){
        return hourlyRate * hours;
    }
}
