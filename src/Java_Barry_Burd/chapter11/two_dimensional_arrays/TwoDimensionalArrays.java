package Java_Barry_Burd.chapter11.two_dimensional_arrays;

import static java.lang.System.out;
import java.io.File;
import java.io.FileNotFoundException;
import java.util. Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) throws FileNotFoundException {

        // Create a two-dimensional array to store guest information for 5 floors and 10 rooms per floor
        int guests[][] = new int [5][10];

        // Create a Scanner object to read data from a file
        Scanner myScanner = new Scanner(new File("GuestList1.txt"));

        // Read guest data from the file into the guests array
        // Each value represents the number of guests for a specific room on a specific floor
        for(int floor = 0; floor < 5; floor++) {
            for(int roomNum = 0; roomNum < 10; roomNum++){
                guests[floor][roomNum] = myScanner.nextInt();
            }
        }

        // Print the guest data in reverse order, floor by floor
        for(int floor = 4; floor >= 0; floor--){
            out.print("Floor " + floor + ":");
            for(int roomNum = 0; roomNum < 10; roomNum++){
                out.print("\t");
                out.print(guests[floor][roomNum]);
            }
            out.println();
        }

        // Print the room numbers for reference
        out.println();
        out.print("Room:\t");
        for(int roomNum = 0; roomNum < 10; roomNum++){
            out.print("\t");
            out.print(roomNum);
        }

        /*Output:
        Floor 4:	5	2	2	1	0	3	3	0	0	0
        Floor 3:	1	1	4	5	0	0	0	2	2	3
        Floor 2:	2	3	1	1	1	2	3	3	2	1
        Floor 1:	4	5	0	2	2	0	0	0	1	1
        Floor 0:	1	3	2	0	4	3	3	2	1	0

        Room:		0	1	2	3	4	5	6	7	8	9*/
    }
}
