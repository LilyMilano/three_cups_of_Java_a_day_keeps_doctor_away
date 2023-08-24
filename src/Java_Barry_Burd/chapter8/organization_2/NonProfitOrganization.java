package Java_Barry_Burd.chapter8.organization_2;

public class NonProfitOrganization extends Organization_2{

    // Method:

    public double getTaxes() {
        return getAnnualRevenue() * 2 / 100;
    }
}
