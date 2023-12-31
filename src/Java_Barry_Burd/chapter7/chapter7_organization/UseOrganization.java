package Java_Barry_Burd.chapter7_organization;

public class UseOrganization {
    public static void main(String[] args) {

        // Declaring and Initializing three new Objects instances of Organization Class:
        Organization organization1 = new Organization();
        Organization organization2 = new Organization();
        Organization organization3 = new Organization();

        // Setting values to constructor fields of each new Object:
        organization1.setName("Advertising Glow");
        organization1.setAnnualRevenue(1000000.00);
        organization1.setProfitMaking(true);

        organization2.setName("Charity Space");
        organization2.setAnnualRevenue(2000000.00);
        organization2.setProfitMaking(false);

        organization3.setName("Brand Solutions");
        organization3.setAnnualRevenue(800000.00);
        organization3.setProfitMaking(true);

        // Using display() - Dot Notation
        organization1.display();
        organization2.display();
        organization3.display();

        /*
        Output:
        Advertising Glow, a profit-making organization, has an annual revenue such as $1000000.0, and pays an amount of taxes of $100000.0
        Charity Space, a not-profit-making organization, has an annual revenue such as $2000000.0, and pays an amount of taxes of $40000.0
        Brand Solutions, a profit-making organization, has an annual revenue such as $800000.0, and pays an amount of taxes of $80000.0
        */

        // Print without method:
        // out.println(organization1.name + ", a " + organization1.getStatus() + " organization, has an annual revenue such as $" + organization1.annualRevenue + ", and pays an amount of taxes of $" + getTaxes() + "\n");
        // out.println(organization2.name + ", a " + organization2.getStatus() + " organization, has an annual revenue such as $" + organization2.annualRevenue + ", and pays an amount of taxes of $" + getTaxes() + "\n");
        // out.println(organization3.name + ", a " + organization3.getStatus() + " organization, has an annual revenue such as $" + organization3.annualRevenue + ", and pays an amount of taxes of $" + getTaxes() + "\n");





    }
}

