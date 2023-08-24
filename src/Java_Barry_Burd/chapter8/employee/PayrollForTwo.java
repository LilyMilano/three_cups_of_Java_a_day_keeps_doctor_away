package Java_Barry_Burd.chapter8.employee;

public class PayrollForTwo {
    public static void main(String[] args) {

        FullTimeEmployee ftEmployee = new FullTimeEmployee();

        ftEmployee.setName("Martin Short");
        ftEmployee.setJobTitle("CEO");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
        System.out.println();

        PartTimeEmployee ptEmployee = new PartTimeEmployee();

        ptEmployee.setName("Steve Martin");
        ptEmployee.setJobTitle("Driver");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(10));

        /*Output:
        Pay to the order of Martin Short (CEO) ***$4,500.00

        Pay to the order of Steve Martin (Driver) ***$75.30*/
    }
}
