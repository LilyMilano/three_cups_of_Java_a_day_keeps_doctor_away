package Java_Barry_Burd.chapter11.hotel;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;
public class Room {

    // Class Fields:
    private int guests;
    private double rate;
    private boolean smoking;
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    // Methods:
    public void readRoom(Scanner diskScanner) {
        guests = diskScanner.nextInt();
        rate = diskScanner.nextDouble();
        smoking = diskScanner.nextBoolean();
    }

    public void writeRoom(){
        out.print(guests + "\t\t");
        out.print(currency.format(rate) + "\t\t");
        out.println(smoking ? "yes" : "no");
    }

    // Getters and setters:

    public int getGuests(){
        return guests;
    }
    public void setGuests(int guests) {
        this.guests = guests;
    }
    public double getRate() {
        return rate;
    }
    public boolean isSmoking() {
        return smoking;
    }
}
