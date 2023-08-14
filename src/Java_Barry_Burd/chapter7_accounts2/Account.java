package Java_Barry_Burd.chapter7_accounts2;

import static java.lang.System.out;
public class Account {

    // An Account displays itself:
    String name;
    String address;
    double balance;

    // Display method:
    public void display() {
        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(" ) has $");
        out.print(balance);
    }

}
