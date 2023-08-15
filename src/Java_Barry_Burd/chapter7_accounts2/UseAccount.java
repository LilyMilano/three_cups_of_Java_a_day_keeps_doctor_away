package Java_Barry_Burd.chapter7_accounts2;

import static java.lang.System.out;

public class UseAccount {

    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Laura Esquivel";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Jandy Nelson";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;

        // Display results:

        myAccount.display();
        out.print(" plus $");
        out.print(myAccount.getInterest(5.00));  // With a literal
        out.println(" interest ");

        yourAccount.display();
        double yourInterestRate = 7.00;  // With a variable
        out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.println(" interest ");
        out.println();

        // Making your numbers look right:

        double myInterest = myAccount.getInterest(5.00);
        double yourInterest = yourAccount.getInterest(7.00);

        out.printf("$%4.2f\n", myInterest);
        out.printf("$%5.2f\n", myInterest);
        out.printf("$%.2f\n", myInterest);
        out.printf("$%3.2f\n", myInterest);
        out.printf("$%.2f $%.2f", myInterest, yourInterest);

        /*
        Output:
        Laura Esquivel (222 Cyberspace Lane ) has $24.02 plus $1.2009999999999998 interest
        Jandy Nelson (111 Consumer Street ) has $55.63 plus $3.8941000000000003 interest

        $1.20
        $ 1.20
        $1.20
        $1.20
        $1.20 $3.89
        */

    }
}
