package Java_Barry_Burd.chapter8.organization_2;

public class DisplayOrgInfo {
    public static void main(String[] args) {

        ProfitMakingOrganization profitOrganization = new ProfitMakingOrganization();
        profitOrganization.setName("Advertising Glow");
        profitOrganization.setAnnualRevenue(1000000.00);

        NonProfitOrganization nonProfitOrganization = new NonProfitOrganization();
        nonProfitOrganization.setName("Charity Space");
        nonProfitOrganization.setAnnualRevenue(1000000.00);

        System.out.printf("%s, a profit-making organization, gains $%,.2f and " +
                        "pays 10 percent in taxes ($%,.2f). %n", profitOrganization.getName(),
                profitOrganization.getAnnualRevenue(), profitOrganization.getTaxes());

        System.out.printf("%s, a non-profit-making organization, gains $%,.2f and " +
                        "pays 2 percent in taxes ($%,.2f). %n", nonProfitOrganization.getName(),
                nonProfitOrganization.getAnnualRevenue(), nonProfitOrganization.getTaxes());
    }
}
