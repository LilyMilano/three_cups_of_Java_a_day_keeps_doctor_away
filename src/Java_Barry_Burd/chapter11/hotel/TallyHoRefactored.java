package Java_Barry_Burd.chapter11.hotel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TallyHoRefactored {
    public static void main(String[] args) {
        int maxGuests = 10;
        int[] guests = new int[maxGuests];
        int[] roomCounts = new int[maxGuests + 1];

        try (Scanner diskScanner = new Scanner(new File("GuestList.txt"))) {
            for (int roomNum = 0; roomNum < maxGuests; roomNum++) {
                guests[roomNum] = diskScanner.nextInt();
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        printInputData(guests);
        tallyCounts(guests, roomCounts, maxGuests);
        printReport(roomCounts, maxGuests);
    }

    private static void printInputData(int[] guests) {
        System.out.println("Room\tGuests");
        for (int roomNum = 0; roomNum < guests.length; roomNum++) {
            System.out.printf("%d\t\t%d%n", roomNum, guests[roomNum]);
        }
        System.out.println();
    }

    private static void tallyCounts(int[] guests, int[] roomCounts, int maxGuests) {
        for (int guestCount : guests) {
            if (guestCount <= maxGuests) {
                roomCounts[guestCount]++;
            }
        }
    }

    private static void printReport(int[] roomCounts, int maxGuests) {
        System.out.println("Guests\tRoom Count");
        for (int guestCount = 0; guestCount <= maxGuests; guestCount++) {
            System.out.printf("%d\t\t%d%n", guestCount, roomCounts[guestCount]);
        }
    }
}
/*
Output:

        Room	Guests
        0		1
        1		4
        2		2
        3		5
        4		2
        5		1
        6		4
        7		3
        8		10
        9		2

        Guests	Room Count
        0		0
        1		2
        2		3
        3		1
        4		2
        5		1
        6		0
        7		0
        8		0
        9		0
        10		1*/
