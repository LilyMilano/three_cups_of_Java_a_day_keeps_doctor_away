package Java_Barry_Burd.chapter8.placeToLive;

import java.util.Scanner;

import static java.lang.System.*;

public class DisplayThePlaces {
    public static void main(String[] args) {

        // Declaring and Initializing three new Objects instances of PlaceToLive Class:
        PlaceToLive place1 = new PlaceToLive();
        PlaceToLive place2 = new PlaceToLive();
        PlaceToLive place3 = new PlaceToLive();

        // Setting values to constructor fields of each new Object:
        place1.setAddress("1306 Jones Street, Fort Worth, TX 76102");
        place1.setNumberOfBedrooms(4);
        place1.setArea(100);

        place2.setAddress("4255 Wildrose Lane, Southfield, MI 48075");
        place2.setNumberOfBedrooms(2);
        place2.setArea(100);

        place3.setAddress("1565 Ethels Lane, Lakeland, FL 33813");
        place3.setNumberOfBedrooms(6);
        place3.setArea(1000);

        Scanner keyboard = new Scanner(in);

        out.println("Enter cost ($) of place 1:");
        place1.cost = keyboard.nextDouble();
        out.println("Enter cost ($) of place 2:");
        place2.cost = keyboard.nextDouble();
        out.println("Enter cost ($) of place 3:");
        place3.cost = keyboard.nextDouble();
        out.println();

        keyboard.close();

        // Display:
        place1.display();
        place2.display();
        place3.display();

        // Output:
        /*Enter cost ($) of place 1:
        1000
        Enter cost ($) of place 2:
        1000
        Enter cost ($) of place 3:
        1000

        Address: 1306 Jones Street, Fort Worth, TX 76102
        Cost per square foot: $10.00
        Cost per bedroom: $250.00

        Address: 4255 Wildrose Lane, Southfield, MI 48075
        Cost per square foot: $10.00
        Cost per bedroom: $500.00

        Address: 1565 Ethels Lane, Lakeland, FL 33813
        Cost per square foot: $1.00
        Cost per bedroom: $166.67*/


    }
}
