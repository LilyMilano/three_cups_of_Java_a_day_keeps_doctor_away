package Java_Barry_Burd.chapter8.organization_2;

public class Organization_2 {

    // Class Fields:

    private String name;
    private double annualRevenue;

    // Getters and setters:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }
    public double getAnnualRevenue() {
        return annualRevenue;
    }
    public void setAnnualRevenue(double annualRevenue) {
        if(annualRevenue >= 0){
            this.annualRevenue = annualRevenue;
        }
    }
}
