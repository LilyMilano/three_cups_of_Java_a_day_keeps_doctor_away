package Java_Barry_Burd;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Chapter5 {

    public static void main(String[] args) {

        // If Statements:
        // Guessing Game:

        Scanner keyboard = new Scanner(in);
        out.println("Enter an int from 1 to 10: ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {
            out.println("**********");
            out.println("*You win.*");
            out.println("**********");
        } else {
            out.println("You lose.");
            out.println("The random number was: ");
            out.println(randomNumber + ".");
        }
        out.println("Thank you for playing.");
        out.println();

        // keyboard.close();

                /* Some explanations:

        The +1 is added to the result of nextInt(10) to shift the range of random numbers generated from 0-9 to 1-10.
        By default, nextInt(n) returns a random integer between 0 (inclusive) and n (exclusive). So nextInt(10) would give a number between 0 and 9.
        But since we want a number between 1 and 10 for this game, we add +1 to the result to offset it by 1 and get the desired range.
        So nextInt(10) + 1 gives a random int from 1 to 10, instead of 0 to 9.

        keyboard.close();
        This statement does some housekeeping to disconnect the Java program from
        the computer keyboard. Using close() to explicitly detach from the keyboard is good practice.
         */

        // Don't tell them they lost ♥
        keyboard = new Scanner(in);
        out.println("Enter an int from 1 to 10: ");

        int inputInt = keyboard.nextInt();
        int randomInt = new Random().nextInt(10) + 1;

        if (inputInt == randomInt) {
            out.println("*You win*");
        }

        out.println("That was a very good guess :-)");
        out.println("The random number was: " + randomInt + ".");
        out.println("Thank you for playing.");
        out.println();

        // keyboard.close();

        // Elevator fitter:

        int weightOfADectuple = 150;
        int elevatorWeightLimit = 1400;

        if (elevatorWeightLimit >= weightOfADectuple * 10) {
            out.println("You can fit all ten of the");
            out.println("Brickenchicker dectuples");
            out.println("on the elevator.");
        } else {
            out.println("You can't fit all ten of the");
            out.println("Brickenchicker dectuples");
            out.println("on the elevator.");
        }
        out.println();

        // Check password:
        out.println("What's the password?");
        keyboard = new Scanner(in);
        String password = keyboard.next();

        out.println("You typed >>" + password + "<<");
        out.println();

        if(password == "swordfish") {
            out.println("""
                    The word you typed is stored
                    in the same place as the real
                    password. You must be a hacker.""");
        } else {
            out.println("""
                    The word you typed is not
                    stored in the same place as
                    the real password, but that's
                    not big deal.""");
        }
        out.println();

        if(password.equals("swordfish")) {
            out.println("""
                    The word you typed has the
                    same characters as the real
                    password. You can use our
                    precious system.""");
        } else {
            out.println("""
                    The word you typed doesn't
                    have the same characters as
                    the real password. You can't
                    use our precious system.""");
        }

        keyboard.close();

    }
}




