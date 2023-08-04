package Java_Barry_Burd;

// Javadoc comments

import javax.swing.*;
import static java.lang.System.out;

/**
 * The Displayer class displays text
 * on the computer screen.
 *
 * @author Barry Burd
 * @version 1.0 1/24/22
 * @see java.lang.System
 */
public class Displayer {

    /**
     * The main method is where
     * execution of the code begins.
     *
     * @param args (See chapter 11.)
     */
    public static void main(String[] args) {
        System.out.println("No more baked beans!");

        // Using variables
        double amountInAccount = 50.22;
        amountInAccount +=  1000000.00;
            System.out.println("You have $" + amountInAccount + " in your account.");
            // Output: You have $1000050.22 in your account.
        amountInAccount = 2000000.00;
            System.out.println("Now you have even more! You have $" + amountInAccount + " in your account.");
            // Output: Now you have even more! You have $2000000.0 in your account.

        float amountInSavingAccount;
        amountInSavingAccount = 50.22F;
        amountInSavingAccount += 1000000.00F;
            System.out.println("You have $" + amountInSavingAccount + " in your saving account.");
            // Output: You have $1000050.25 in your saving account.

        // Elevator Fitter:
        int weightOfAPerson = 150;
        int elevatorWeightLimit = 1400;
        int numberOfPeople;

        numberOfPeople =  elevatorWeightLimit / weightOfAPerson;
            System.out.println("You can fit " + numberOfPeople + " people on the elevator.");
            // Output: You can fit 9 people on the elevator.

        // Leap year anniversary:
        int years = 8;
        int numberOfAnniversaries;
        int anniversaryEvery = 4;

        numberOfAnniversaries = years / anniversaryEvery;
            System.out.println("Number of anniversaries: " + numberOfAnniversaries + ".");
            // Output: Number of anniversaries: 2.

        // ***************************************************************

        // Char type
        char myLittleChar = 'b';
        char myBigChar = Character.toUpperCase(myLittleChar);
            System.out.println(myBigChar);  // Output: B

        // ***************************************************************

        // boolean type: Elevator Fitter 2
        System.out.println();
        System.out.println("True or False?");
        System.out.println("You can fit all ten of the dectuplets on the elevator:");
        System.out.println();

        int weightPerPerson = 150;
        int elevatorLimit = 1400;
        int personsAdmitted = elevatorLimit / weightPerPerson;
        boolean allTenOkay = personsAdmitted >= 10;

        System.out.println(allTenOkay);     // Output: false

        // ***************************************************************
        /*Reference types: String and JFrame are the names of Java classes!!!
        Every Java class is a reference type. If you declare a variable to have some type
        that’s not a primitive type, the variable’s type is (most of the time) the name of a
        Java class.*/

        // Show a Frame

        JFrame myFrame = new JFrame();
        String myTitle = "Blank Frame";

        myFrame.setTitle(myTitle);
        myFrame.setSize(900,200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

        // ***************************************************************

        // Make change:
        int total = 248;
        int quarters = total / 25;
        int whatsLeft = total % 25;

        int dimes = whatsLeft / 10;
        whatsLeft = whatsLeft % 10;

        int nickels = whatsLeft / 5;
        whatsLeft = whatsLeft % 5;

        int cents = whatsLeft;

        out.println();
        out.println("From " + total + " cents you get:");
        out.println(quarters + " quarters");
        out.println(dimes + " dimes");
        out.println(nickels + " nickels");
        out.println(cents + " cents");
        out.println();

        /* Output:
        From 248 cents you get
        9 quarters
        2 dimes
        0 nickels
        3 cents */

        // ***************************************************************

        // Increment and decrement operators in Java:
        int numberOfBunnies = 27;
        ++numberOfBunnies;
        out.println(numberOfBunnies);   // 28
        out.println(++numberOfBunnies); // 29
        out.println(numberOfBunnies);   // 29

        int numberOfCats = 27;
        numberOfCats++;
        out.println();
        out.println(numberOfCats);  // 28
        out.println(numberOfCats++);    // 28
        out.println(numberOfCats);  // 29
        out.println();

        // Prognostication Game:
        int i = 10;
        out.println(i++);   // 10
        out.println(--i);   // 10
        --i;
        i--;
        out.println(i);     // 8
        out.println(++i);   // 9
        out.println(i--);   // 9
        out.println(i);     // 8
        i++;
        i = i++ + ++i;
        out.println(i);     // 20
        i = i++ + i++;
        out.println(i);     //41
        out.println();

        // Assignment operators:
        int numberOfDogs = 27;
        int numberExtra = 53;

        numberOfDogs += 1;
        out.println(numberOfDogs);  // 28

        numberOfDogs += 5;
        out.println(numberOfDogs);  // 33

        numberOfDogs +=  numberExtra;
        out.println(numberOfDogs);  // 86

        numberOfDogs *= 2;
        out.println(numberOfDogs);  // 172

        out.println(numberOfDogs -= 7); // 165

        out.println(numberOfDogs = 100);    // 100
        out.println();



    }
}
