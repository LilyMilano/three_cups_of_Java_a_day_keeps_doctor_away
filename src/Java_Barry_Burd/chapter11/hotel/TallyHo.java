package Java_Barry_Burd.chapter11.hotel;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TallyHo {

    public static void main(String[] args) throws IOException {

        int maxGuests = 10;

        int[] guests = new int[10];
        int[] howManyRoomsWith = new int[maxGuests + 1];

        Scanner diskScanner = new Scanner(new File("GuestList.txt"));

        // Read guest counts from file
        for(int roomNum = 0; roomNum < 10; roomNum++){
            guests[roomNum] = diskScanner.nextInt();
        }

        // Print input data
        System.out.println("Room\tGuests");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum);
            System.out.print("\t\t");
            System.out.println(guests[roomNum]);
        }
        System.out.println();

        // Tally counts
        for(int roomNum = 0; roomNum < 10; roomNum++){
            int guestCount = guests[roomNum];
            if(guestCount <= maxGuests){
                howManyRoomsWith[guestCount]++;
            }
        }

        // Print report
        System.out.println("Guests\tRoom Count");
        for(int guestCount = 0; guestCount <= maxGuests; guestCount++){
            System.out.println(guestCount + "\t\t" + howManyRoomsWith[guestCount]);
        }

        // Output:
        /*Room	Guests
        0		1
        1		4
        2		2
        3		5
        4		2
        5		1
        6		4
        7		3
        8		10
        9		2

        Guests	Room Count
        0		0
        1		2
        2		3
        3		1
        4		2
        5		1
        6		0
        7		0
        8		0
        9		0
        10		1*/
    }
}