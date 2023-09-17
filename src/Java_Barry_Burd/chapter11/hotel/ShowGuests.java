package Java_Barry_Burd.chapter11.hotel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class ShowGuests {
    public static void main(String[] args) throws IOException {
        int[] guests = new int[10];
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));

        for (int roomNumber = 0; roomNumber < 10; roomNumber++) {
            guests[roomNumber] = diskScanner.nextInt();
        }
        out.println("Room\tGuests");

        for (int roomNumber = 0; roomNumber < 10; roomNumber++) {
            out.print(roomNumber);
            out.print("\t\t");
            out.println(guests[roomNumber]);
        }
        diskScanner.close();
        out.println();

        // Find the biggest.............................................

        // Using enhanced for loop:
        int largestSoFar = 0;

        for (int guest : guests) {
            if (guest > largestSoFar) {
                largestSoFar = guest;
            }
        }

        for(int i = 0; i < guests.length; i++){
            if(guests[i] == largestSoFar){
                out.println(largestSoFar + " guests in Room " + i);
            }
        }

        /* Note: Use two for loop because enhanced for loop doesn't update maxGuests again because it already found a max earlier.
        So it only prints out the first max it encounters, even if there are duplicates later.
        The regular for loop indexes each element directly, so it can check each one for a new max value.
        The enhanced for loop just iterates sequentially without indexing, so it misses later duplicates.*/

    }
}

        /*Output:
        Room	Guests
        0		1
        1		4
        2		2
        3		0
        4		2
        5		1
        6		4
        7		3
        8		0
        9		2

        4 guests in Room 1
        4 guests in Room 6
        */
