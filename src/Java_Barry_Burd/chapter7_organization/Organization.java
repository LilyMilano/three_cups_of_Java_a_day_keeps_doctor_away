package Java_Barry_Burd.chapter7_organization;

import static java.lang.System.out;

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

    public double getTaxes() {
        if(profitMaking) {
            return annualRevenue * 10.00 / 100.00;
        } else return annualRevenue * 2.00 / 100.00;
    }

    // Display method:
    public void display() {
        out.print(name);
        out.print(", a ");
        out.print(getStatus());
        out.print(" organization, has an annual revenue such as $");
        out.print(annualRevenue);
        out.print(", and pays an amount of taxes of $");
        out.print(getTaxes() + "\n");
    }
}
