package Java_Barry_Burd;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Chapter6 {
    public static void main(String[] args) {

        // Controlling program flow with loops:

        //  A repeating guessing game:

        Scanner keyboard = new Scanner(in);

        int numGuesses = 0;
        int randomNumber = new Random().nextInt(10) + 1;

        out.println(" ***************** ");
        out.println("Welcome to the Guessing Game");
        out.println(" ***************** ");
        out.println();

        out.print("Enter an int from 1 to 10: ");
        int inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            out.println();
            out.println("Try again...");
            out.print("Enter an int from 1 to 10: ");
            inputNumber = keyboard.nextInt();
            numGuesses++;
        }
        out.println("You win after " + numGuesses + " guesses.");

        out.println();
        // keyboard.close();

        // .............................................................................................................

        // Bigger and better:
      /*  Modify the program in Listing 6-1 so that the randomly generated number is a
        number from 1 through 100. To make life bearable for the game player, have the
        program give a hint whenever the player guesses incorrectly. Hints such as Try a
        higher number or Try a lower number are helpful.*/

        keyboard = new Scanner(in);

        numGuesses = 0;
        randomNumber = new Random().nextInt(100) + 1;

        out.println(" ***************** ");
        out.println("Welcome to the Guessing Game");
        out.println(" ***************** ");
        out.println();

        out.print("Enter an int from 1 to 100: ");
        inputNumber = keyboard.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber) {
            if (inputNumber < randomNumber) {
                out.println();
                out.println("Try again...");
                out.print("Enter an int from 1 to 100: ");
                out.println("Try a higher number 😉");
                inputNumber = keyboard.nextInt();
                numGuesses++;
            } else {
                out.println();
                out.println("Try again...");
                out.print("Enter an int from 1 to 100: ");
                out.println("Try a lower number 😉");
                inputNumber = keyboard.nextInt();
                numGuesses++;
            }

        }
        out.println("You win after " + numGuesses + " guesses 🎉");

        out.println();
        // keyboard.close();

        // .............................................................................................................
        // No negativity:

        /*Write a program in which the user types int values, one after another. The program
        stops looping when the user types a number that isn’t positive (for example,
        the number 0 or the number –17). After all the looping, the program displays the
        largest number that the user typed.*/

        keyboard = new Scanner(in);
        out.println("Enter a positive integer number: ");
        inputNumber = keyboard.nextInt();

        int largestNumber = 0;

        while (inputNumber > 0) {
            if (inputNumber > largestNumber) {
                largestNumber = inputNumber;
            }
            out.println("Enter a positive integer number: ");
            inputNumber = keyboard.nextInt();
        }
        out.println(largestNumber);
        out.println("The largest number entered was: " + largestNumber + ".");
        out.println();

        keyboard.close();

        // .............................................................................................................

    }
}
