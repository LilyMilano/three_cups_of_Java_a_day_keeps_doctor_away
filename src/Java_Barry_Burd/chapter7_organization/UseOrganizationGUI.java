package Java_Barry_Burd.chapter7_organization;

import Java_Barry_Burd.chapter7_GUI.PracticeFrame;

public class UseOrganizationGUI {
    public static void main(String[] args) {
        PracticeFrame frame = new PracticeFrame("Display taxes amount");
        frame.addRow("Organization's name");
        frame.addRow("Annual revenue");
        frame.addRow("Profit-making status");
        frame.setButtonText("Display");
        frame.go();
    }

    public static String calculate(String name, double annualRevenue, boolean profitMaking){
        Organization organization1 = new Organization();

        organization1.setName(name);
        organization1.setAnnualRevenue(annualRevenue);
        organization1.setProfitMaking(profitMaking);

        return organization1.getName() + " (annual revenue: $" + organization1.getAnnualRevenue() + ") pays $" + organization1.getTaxes() + " in taxes.";
    }
}


