package Java_Barry_Burd.chapter7_accounts_accessor_methods;

import static java.lang.System.out;

public class UseAccount {
    // Calling Accessor Methods:

    public static void main(String[] args) {

        // Creating Objects:
        Account myAccount = new Account();
        Account yourAccount = new Account();

        // Giving values to the fields with setters:
        myAccount.setName("Mario Puzo");
        myAccount.setAddress("931 Milford Street, Manchester, NH 03103");
        myAccount.setBalance(24.02);

        yourAccount.setName("Myriam D. Thompson");
        yourAccount.setAddress("1390 Godfrey Street, Merida, OR 97062");
        yourAccount.setBalance(55.63);

        // Displaying the output:
        out.print(myAccount.getName());
        out.print(" (");
        out.print(myAccount.getAddress());
        out.print(") has $");
        out.print(myAccount.getBalance());
        out.println();

        out.print(yourAccount.getName());
        out.print(" (");
        out.print(yourAccount.getAddress());
        out.print(") has $");
        out.print(yourAccount.getBalance());
        out.println();

        /*Output:
        Mario Puzo (931 Milford Street, Manchester, NH 03103) has $24.02
        Myriam D. Thompson (1390 Godfrey Street, Merida, OR 97062) has $55.63*/
    }
}
