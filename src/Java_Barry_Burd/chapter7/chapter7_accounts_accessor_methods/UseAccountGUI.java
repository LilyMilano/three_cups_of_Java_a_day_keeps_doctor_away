package Java_Barry_Burd.chapter7_accounts_accessor_methods;

import Java_Barry_Burd.chapter7_GUI.PracticeFrame;
public class UseAccountGUI {
    public static void main(String[] args) {
        PracticeFrame frame = new PracticeFrame("Display an Account");
        frame.addRow("Full name");
        frame.addRow("Address");
        frame.addRow("Balance");
        frame.setButtonText("Display");
        frame.go();
    }

    public static String calculate(String name, String address, double balance){
        Account myAccount = new Account();

        myAccount.setName(name);
        myAccount.setAddress(address);
        myAccount.setBalance(balance);

        return myAccount.getName() + " (" + myAccount.getAddress() + ") has $" + myAccount.getBalance();
    }
}
