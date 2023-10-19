package Java_Barry_Burd.chapter12.employee;

import java.text.NumberFormat;
import java.util.ArrayList;

public class TotalBonuses {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        fillTheList(employees);

        double total = employees.stream()
                .filter(employee -> employee.getScore() >= 3)
                .map(employee -> 100.00)
                .reduce(0.0, Double::sum);

        System.out.println(currency.format(total));    // $300.00
    }

    static void fillTheList(ArrayList<Employee> employees) {
        employees.add(new Employee("Paula Hawkins", 3.0));
        employees.add(new Employee("Jamie King", 2.0));
        employees.add(new Employee("Stephen Piet", 5.0));
        employees.add(new Employee("Joey King", 5.0));
    }
}
