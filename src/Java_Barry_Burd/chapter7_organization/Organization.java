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

    // Display method:
    public void display() {
        out.print(name);
        out.print(", a ");
        out.print(getStatus());
        out.print(" organization, has an annual revenue such as $");
        out.print(annualRevenue + "\n");
    }
}
