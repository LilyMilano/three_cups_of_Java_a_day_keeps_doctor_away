package Java_Barry_Burd.chapter11.hotel;
import static java.lang.System.*;

public class EnhancedShowGuests {
    public static void main(String[] args) {

        int[] guests = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
        int roomNumber = 0;

        out.println("Room\tGuests");

        for(int numGuests : guests){
            out.println(roomNumber++ + "\t\t" + numGuests);
        }

        /*Room	Guests
        0		1
        1		4
        2		2
        3		0
        4		2
        5		1
        6		4
        7		3
        8		0
        9		2*/
    }
}
