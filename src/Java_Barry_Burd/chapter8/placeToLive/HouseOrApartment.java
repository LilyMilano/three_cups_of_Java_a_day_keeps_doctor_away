package Java_Barry_Burd.chapter8.placeToLive;

public class HouseOrApartment extends PlaceToLive{


    // Class Fields:........................................................

    // House:
    private double monthlyMortgage;
    private double yearlyPropertyTax;

    // Apartment:
    private double rent;

    // Getters and Setters:..................................................

    // House:
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

    // Apartment:

    public double getRent() {
        return rent;
    }
    public void setRent(double rent) {
        this.rent = rent;
    }

    // Methods:...................................................................

    // House
    public double getTotalMonthlyPayment() {
        return monthlyMortgage + (yearlyPropertyTax / 12);
    }
}


