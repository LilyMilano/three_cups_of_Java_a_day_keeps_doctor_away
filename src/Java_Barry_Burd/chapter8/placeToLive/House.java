package Java_Barry_Burd.chapter8.placeToLive;

public class House extends PlaceToLive{

    // Class Fields:........................................................

    private double monthlyMortgage;
    private double yearlyPropertyTax;

    // Getters and Setters:..................................................

    public double getMonthlyMortgage() {
        return monthlyMortgage;
    }
    public void setMonthlyMortgage(double monthlyMortgage){
        this.monthlyMortgage = monthlyMortgage;
    }
    public double getYearlyPropertyTax(){
        return yearlyPropertyTax;
    }
    public void setYearlyPropertyTax(double yearlyPropertyTax) {
        this.yearlyPropertyTax = yearlyPropertyTax;
    }

    // Methods:...................................................................

    public double getTotalMonthlyPayment() {
        return monthlyMortgage + (yearlyPropertyTax / 12);
    }
}
