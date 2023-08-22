package Java_Barry_Burd.chapter8.placeToLive;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplayThePlacesFromDiskFile {

    public static void main(String[] args) throws IOException {
        var diskScanner = new Scanner(new File("dataFiles\\places.txt"));
        var keyboard = new Scanner(System.in);

        var place1 = new PlaceToLive();
        place1.setAddress(diskScanner.nextLine());
        place1.setArea(diskScanner.nextDouble());
        place1.setNumberOfBedrooms(diskScanner.nextInt());
        System.out.print("Cost of " + place1.getAddress() + ": ");
        double cost1 = keyboard.nextDouble();

        diskScanner.nextLine();

        var place2 = new PlaceToLive();
        place2.setAddress(diskScanner.nextLine());
        place2.setArea(diskScanner.nextDouble());
        place2.setNumberOfBedrooms(diskScanner.nextInt());
        System.out.print("Cost of " + place2.getAddress() + ": ");
        double cost2 = keyboard.nextDouble();

        System.out.println(place1.getAddress());
        System.out.println
                ("  Cost per unit area: " + cost1 / place1.getArea());
        System.out.println
                ("  Cost per bedroom:   " + cost1/ place1.getNumberOfBedrooms());

        System.out.println(place2.getAddress());
        System.out.println
                ("  Cost per unit area: " + cost2 / place2.getArea());
        System.out.println
                ("  Cost per bedroom:   " + cost2 / place2.getNumberOfBedrooms());

        diskScanner.close();
        keyboard.close();
    }
}