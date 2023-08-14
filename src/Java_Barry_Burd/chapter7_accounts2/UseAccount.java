package Java_Barry_Burd.chapter7_accounts2;

public class UseAccount {

    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.name = "Laura Esquivel";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.05;

        yourAccount.name = "Jandy Nelson";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.03;

        myAccount.display();
        System.out.println();
        yourAccount.display();

        /*
        Output:
        Laura Esquivel (222 Cyberspace Lane ) has $24.05
        Jandy Nelson (111 Consumer Street ) has $55.03
        */
    }
}
