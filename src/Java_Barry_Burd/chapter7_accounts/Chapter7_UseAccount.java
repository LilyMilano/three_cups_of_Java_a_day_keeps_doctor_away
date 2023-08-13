package Java_Barry_Burd.chapter7_accounts;

import Java_Barry_Burd.chapter7_accounts.Chapter7_Account;

import static java.lang.System.out;
public class Chapter7_UseAccount {
    public static void main(String[] args) {
        // Declaring and Initializing two new Objects instances of Chapter7_Account class:
        Chapter7_Account myAccount = new Chapter7_Account();
        Chapter7_Account yourAccount = new Chapter7_Account();

        // Giving values to constructor Fields of each Object:
        myAccount.name = "Jane Spears";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Joey King";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.03;

        // Using Objects Fields - Dot Notation
        // Printing values:

        out.print(myAccount.name);
        out.print(" (");
        out.print(myAccount.address);
        out.print(") has $");
        out.println(myAccount.balance);
        out.println();

        out.print(yourAccount.name);
        out.print(" (");
        out.print(yourAccount.address);
        out.print(") has $");
        out.println(yourAccount.balance);
        out.println();

        /* Output:
        Jane Spears (222 Cyberspace Lane) has $24.02

        Joey King (111 Consumer Street) has $55.03
        */


    }
}
