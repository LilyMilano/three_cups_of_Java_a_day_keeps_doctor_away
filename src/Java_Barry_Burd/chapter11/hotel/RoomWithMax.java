package Java_Barry_Burd.chapter11.hotel;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

public class RoomWithMax extends Room {

    // Class Field:
    private int maxOccupancy;

    // Getter:
    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    // Methods:
    @Override
    public void readRoom(Scanner diskScanner){
        super.readRoom(diskScanner);
        maxOccupancy = diskScanner.nextInt();
    }

    public void writeRoom(PrintStream listOut) {
        listOut.println(getGuests());
        listOut.println(getRate());
        listOut.println(isSmoking());
        listOut.println(getMaxOccupancy());
    }
}
