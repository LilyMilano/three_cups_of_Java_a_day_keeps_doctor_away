package Java_Barry_Burd.chapter11.hotel;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import static java.lang.System.out;

public class FindVacancyUsingRWMax {
    public static void main(String[] args) throws IOException {
        RoomWithMax[] room = new RoomWithMax[10];
        int roomNum;

        Scanner diskScanner = new Scanner(new File("RoomList.txt"));
        for(roomNum = 0; roomNum < 10; roomNum++){
            room[roomNum] = new RoomWithMax();
            room[roomNum].readRoom(diskScanner);
        }
        diskScanner.close();

        Scanner keyboard = new Scanner(System.in);
        out.print("How many people? ");
        int howMany = keyboard.nextInt();
        out.print("Smoking? (y/n) ");
        boolean wantSmoking = keyboard.findWithinHorizon(".", 0).charAt(0) == 'y';
        keyboard.close();

        roomNum = 0;
        while(roomNum < 10 && (room[roomNum].getGuests() != 0 || room[roomNum].isSmoking() != wantSmoking || room[roomNum].getMaxOccupancy() < howMany)) {
            roomNum++;
        }

        if(roomNum == 10){
            out.println("Sorry, no vacancy");
        } else {
            out.println("You're in room " + roomNum);
            room[roomNum].setGuests(howMany);

            PrintStream listOut = new PrintStream("RoomList.txt");
            for(roomNum = 0; roomNum < 10; roomNum++){
                room[roomNum].writeRoom(listOut);
            }
            listOut.close();
        }

        /*Output:
        How many people? 4
        Smoking? (y/n) y
        You're in room 8*/

    }
}
