package Java_Barry_Burd.chapter11.hotel;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

public class FindVacancy {
    public static void main(String[] args) throws IOException {

        // Declare and initialize guests array
        int[] guests = new int[10];
        int roomNum;

        // Read guest data from file into array
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));
        for(roomNum = 0; roomNum < 10; roomNum++){
            guests[roomNum] = diskScanner.nextInt(); // Filling the array
        }
        diskScanner.close();

        // Find first vacant room
        /*The bottom line is, you must check roomNum < 10 before
        you check guests[roomNum] != 0. To force Java to do the roomNum < 10 check first,
        you put roomNum < 10 on the left side of the while statement's condition.
        With roomNum < 10 on the left side of the && operator, short circuit evaluation
        prevents Java from accidentally evaluating guests[roomNum] != 0
        with roomNum equal to 10.*/

        roomNum = 0;
        while (roomNum < 10 && guests[roomNum] != 0){
            roomNum++;
        }

        // Check if no vacant rooms
        if(roomNum  == 10){
            out.println("Sorry, no vacancy");
        } else {
            // Get number of guests for vacant room
            out.print("How many people for room ");
            out.print(roomNum);
            out.print("? ");

            Scanner keyboard = new Scanner(System.in);
            guests[roomNum] = keyboard.nextInt();
            keyboard.close();

            // Write updated data back to file
            PrintStream listOut = new PrintStream("GuestList.txt");
            for(roomNum = 0; roomNum < 10; roomNum++){
                listOut.print(guests[roomNum]);
                listOut.print(" ");
            }
            listOut.close();
        }
    }
}
