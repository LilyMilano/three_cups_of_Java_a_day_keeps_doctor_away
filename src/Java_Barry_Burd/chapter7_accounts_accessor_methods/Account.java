package Java_Barry_Burd.chapter7_accounts_accessor_methods;

public class Account {
    // Hide Those Fields:

    // Declaring fields:
    private String name;
    private String address;
    private double balance;

    // setters and getters:
    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setAddress(String a) {
        address = a;
    }
    public String getAddress() {
        return address;
    }

    public void setBalance(double b){
        balance = b;
    }
    public double getBalance(){
        return balance;
    }
}
