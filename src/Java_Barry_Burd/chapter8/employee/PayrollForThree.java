package Java_Barry_Burd.chapter8.employee;

public class PayrollForThree {
    public static void main(String[] args) {

        FullTimeEmployee ftEmployee = new FullTimeEmployee();
        ftEmployee.setName("Dylan Spouse");
        ftEmployee.setJobTitle("CEO");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());

        PartTimeEmployee ptEmployee = new PartTimeEmployee();
        ptEmployee.setName("Barbara Smith");
        ptEmployee.setJobTitle("Co-Founder");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(50));

        PartTimeWithOver ptoEmployee = new PartTimeWithOver();
        ptoEmployee.setName("Taylor Swift");
        ptoEmployee.setJobTitle("Co-Founder");
        ptoEmployee.setHourlyRate(7.53);
        ptoEmployee.cutCheck(ptoEmployee.findPaymentAmount(50));

        /*
        Output:
        Pay to the order of Dylan Spouse (CEO) ***$4,500.00
        Pay to the order of Barbara Smith (Co-Founder) ***$376.50
        Pay to the order of Taylor Swift (Co-Founder) ***$451.80
        */
    }
}
