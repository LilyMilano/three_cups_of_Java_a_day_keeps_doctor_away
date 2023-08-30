package Java_Barry_Burd.chapter8.employee;

public class FullTimeEmployee extends Employee{

    // Class Fields:
    private double weeklySalary;
    private double benefitDeduction;

    // Constructors:
    public FullTimeEmployee() {
        super();
    }
    public FullTimeEmployee(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }

    // Setters and Getters:
    public void setWeeklySalary(double weeklySalaryIn) {
        this.weeklySalary = weeklySalaryIn;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setBenefitDeduction(double benefitDeductionIn) {
        this.benefitDeduction = benefitDeductionIn;
    }
    public double getBenefitDeduction(){
        return benefitDeduction;
    }

    // Methods:

    public double findPaymentAmount(){
        return weeklySalary - benefitDeduction;
    }
}

