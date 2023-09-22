package Java_Barry_Burd.chapter11.hotel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;
public class ShowRooms {
    public static void main(String[] args) throws IOException {

        Room[] rooms = new Room[10]; // Array of ten storage slots destined to refer to Objects
        Scanner diskScanner = new Scanner(new File("RoomList.txt"));

        for(int roomNum = 0; roomNum < 10; roomNum++){
            rooms[roomNum] = new Room(); // the statement makes the slot rooms[0] refer to an actual object (an instance of the Room class).
            rooms[roomNum].readRoom(diskScanner);
        }

        out.println("Room\tGuests\tRate\tSmoking?");

        for(int roomNum = 0; roomNum < 10; roomNum++){
            out.print(roomNum + "\t\t");
            rooms[roomNum].writeRoom();
        }
        diskScanner.close();

        /*Output:
        Room	Guests	Rate	Smoking?
        0		1		$60.00		yes
        1		4		$60.00		yes
        2		2		$60.00		no
        3		0		$60.00		no
        4		2		$80.00		yes
        5		1		$80.00		no
        6		4		$80.00		no
        7		3		$80.00		no
        8		0		$100.00		yes
        9		2		$100.00		no*/
    }
}
