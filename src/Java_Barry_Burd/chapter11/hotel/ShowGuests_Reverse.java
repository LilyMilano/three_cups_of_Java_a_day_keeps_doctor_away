package Java_Barry_Burd.chapter11.hotel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class ShowGuests_Reverse {
    public static void main(String[] args) throws IOException {
        int[] guests = new int[10];
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));

        for(int roomNumber = 0; roomNumber < 10; roomNumber++){
            guests[roomNumber] = diskScanner.nextInt();
        }
        out.println("Room\tGuests");

        for(int roomNumber = 9; roomNumber >= 0; roomNumber--){
            out.print(roomNumber);
            out.print("\t\t");
            out.println(guests[roomNumber]);
        }
        diskScanner.close();
    }
}

/*Output:
Room	Guests
9		2
8		0
7		3
6		4
5		1
4		2
3		0
2		2
1		4
0		1*/
