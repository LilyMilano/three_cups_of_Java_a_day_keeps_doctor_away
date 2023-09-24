package Java_Barry_Burd.chapter11.two_dimensional_arrays;

import Java_Barry_Burd.chapter11.hotel.Room;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class TwoDimArrOfObjects {
    public static void main(String[] args) throws FileNotFoundException {
        Room rooms[][] = new Room[5][10];
        Scanner myScanner = new Scanner(new File("RoomList2.txt"));

        for (int floor = 0; floor < 5; floor++) {
            for (int roomNum = 0; roomNum < 10; roomNum++) {
                rooms[floor][roomNum] = new Room();
                rooms[floor][roomNum].readRoom(myScanner);
            }
        }

        for(int floor = 4; floor >= 0; floor--){
            out.println("Floor " + floor + ":");
            for(int roomNum = 0; roomNum < 10; roomNum++){
                out.print("\t");
                rooms[floor][roomNum].writeRoom();
            }
            out.println();
        }

        /*Output:
        Floor 4:
        1		$60.00		yes
        4		$60.00		yes
        2		$60.00		no
        0		$60.00		no
        2		$80.00		yes
        1		$80.00		no
        4		$80.00		no
        3		$80.00		no
        0		$100.00		yes
        2		$100.00		no

        Floor 3:
        1		$60.00		yes
        4		$60.00		yes
        2		$60.00		no
        0		$60.00		no
        2		$80.00		yes
        1		$80.00		no
        4		$80.00		no
        3		$80.00		no
        0		$100.00		yes
        2		$100.00		no

        Floor 2:
        1		$60.00		yes
        4		$60.00		yes
        2		$60.00		no
        0		$60.00		no
        2		$80.00		yes
        1		$80.00		no
        4		$80.00		no
        3		$80.00		no
        0		$100.00		yes
        2		$100.00		no

        Floor 1:
        1		$60.00		yes
        4		$60.00		yes
        2		$60.00		no
        0		$60.00		no
        2		$80.00		yes
        1		$80.00		no
        4		$80.00		no
        3		$80.00		no
        0		$100.00		yes
        2		$100.00		no

        Floor 0:
        1		$60.00		yes
        4		$60.00		yes
        2		$60.00		no
        0		$60.00		no
        2		$80.00		yes
        1		$80.00		no
        4		$80.00		no
        3		$80.00		no
        0		$100.00		yes
        2		$100.00		no*/
    }
}
