package Java_Barry_Burd.chapter11.hotel;
import java.util.Arrays;

import static java.lang.System.out;
public class ShowGuest_array_initializer {
    public static void main(String[] args) {
        int[] guests = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};

        out.println("Room\tGuests");

        for(int roomNumber = 0; roomNumber < 10; roomNumber++){
            out.println(roomNumber + "\t\t" + guests[roomNumber] );
        }

        /*Output

        Room	Guests
        0		1
        1       4
        2		2
        3		0
        4		2
        5		1
        6		4
        7		3
        8		0
        9		2
        */

        out.println();
        out.println(guests);    // [I@12edcd21 😢 Implicit call to 'toString()' on array 'guests'
        out.println(Arrays.toString(guests));   // [1, 4, 2, 0, 2, 1, 4, 3, 0, 2]
        Arrays.sort(guests);
        out.println(Arrays.toString(guests));   // [0, 0, 1, 1, 2, 2, 2, 3, 4, 4]
        Arrays.fill(guests, 0);
        out.println(Arrays.toString(guests));   // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}