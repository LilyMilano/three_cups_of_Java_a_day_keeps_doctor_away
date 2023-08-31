package Java_Barry_Burd.chapter7_organization;

import static java.lang.System.out;

public class Organization {     // Declaring Organization class
    private String name;
    private double annualRevenue;
    private boolean profitMaking;

    // Getters and setters:

    public void setName(String name1) {
        if(!name1.equals("")){
        name = name1;
        }
    }
    public String getName() {
        return name;
    }
    public void setAnnualRevenue(double annualRevenue1) {
            if(annualRevenue1 >= 0){
                annualRevenue = annualRevenue1;
            }
    }
    public double getAnnualRevenue() {
        return annualRevenue;
    }
    public void setProfitMaking(boolean profitMaking1) {
        profitMaking = profitMaking1;
    }
    public boolean getProfitMaking(){
        return profitMaking;
    }

    // Methods:
    public String getStatus() {
        if(profitMaking) {
            return "profit-making";
        } else {
            return "not-profit-making";
        }
    }
    public double getTaxes() {
        if(profitMaking) {
            return annualRevenue * 10.00 / 100.00;
        } else return annualRevenue * 2.00 / 100.00;
    }
    // Display method:
    public void display() {
        out.print(getName());
        out.print(", a ");
        out.print(getStatus());
        out.print(" organization, has an annual revenue such as $");
        out.print(getAnnualRevenue());
        out.print(", and pays an amount of taxes of $");
        out.print(getTaxes() + "\n");
    }
}
