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

        FullTimeEmployee ftEmployee1 =  new FullTimeEmployee();
        ftEmployee1.setName("Selena Gomez");
        ftEmployee1.setJobTitle("Vice-President");
        ftEmployee1.setWeeklySalary(6000.00);
        ftEmployee1.setBenefitDeduction(600.00);
        ftEmployee1.cutCheck(ftEmployee1.findPaymentAmount());
        System.out.println();

        PartTimeEmployee ptEmployee = new PartTimeEmployee();

        ptEmployee.setName("Steve Martin");
        ptEmployee.setJobTitle("Driver");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(10));

        /*Output:
        Pay to the order of Martin Short (CEO) ***$4,500.00

        Pay to the order of Selena Gomez (Vice-President) ***$5,400.00

        Pay to the order of Steve Martin (Driver) ***$75.30*/
    }
}
