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

        /*Reading room information from a file: This block of code initializes an array of RoomWithMax objects,
        reads room information from the "RoomList.txt" file using a Scanner, and assigns the values to the corresponding
        RoomWithMax objects. This is important for initializing the room data for further processing.*/

        Scanner diskScanner = new Scanner(new File("RoomList.txt"));
        for(roomNum = 0; roomNum < 10; roomNum++){
            room[roomNum] = new RoomWithMax();
            room[roomNum].readRoom(diskScanner);
        }
        diskScanner.close();

        /*User input: This block of code prompts the user for the number of people and smoking preferences.
        The user's input is crucial for finding a suitable room that matches their preferences.
        Using keyboard.findWithinHorizon(".", 0) allows the code to read a single character directly,
        without considering whitespace or other tokens. This can be useful when you specifically want to read
        a single character as input.*/
        Scanner keyboard = new Scanner(System.in);
        out.print("How many people? ");
        int howMany = keyboard.nextInt();
        out.print("Smoking? (y/n) ");
        boolean wantSmoking = keyboard.findWithinHorizon(".", 0).charAt(0) == 'y';
        keyboard.close();

        /*Finding a vacant room: This block of code iterates through the room array and checks each room's availability,
        smoking status, and maximum occupancy to find the first vacant room that matches the user's preferences.*/
        roomNum = 0;
        while(roomNum < 10 && (room[roomNum].getGuests() != 0 || room[roomNum].isSmoking() != wantSmoking || room[roomNum].getMaxOccupancy() < howMany)) {
            roomNum++;
        }

        /*Updating room information and saving to file: If a vacant room is found, this block of code updates the
        room's guest count, creates a PrintStream to write the updated room information to the "RoomList.txt" file,
        and saves the changes.*/
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
