package Java_Barry_Burd.chapter7_organization;

public class Organization {     // Declaring Organization class
    String name;
    double annualRevenue;
    boolean profitMaking;

    public String getStatus() {
        if(profitMaking) {
            return "profit-making";
        } else {
            return "not-profit-making";
        }
    }
}
