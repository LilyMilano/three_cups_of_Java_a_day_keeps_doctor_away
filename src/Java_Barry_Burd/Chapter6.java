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

        // keyboard.close();

        // .............................................................................................................
        // FOR LOOP:
        // for ( initialization ; expression ; update )

        for (int count = 1; count <= 10; count++) {
            out.println("The value of count is: " + count + ".");
        }
        out.println("Done!");
        out.println();

        // .............................................................................................................

       /* The program in Listing 6-3 prints all the lyrics of
        the hit single “Al’s All Wet.” (You can find the lyrics in Chapter 5.)*/

        String intro = """
                Al's all wet. Oh, why is Al all wet? Oh,
                Al's all wet 'cause he's standing in the rain.""";

        for (int verse = 1; verse <= 3; verse++) {
            out.println(intro);
            out.println("Why is Al out in the rain?");

            out.println(switch (verse) { // switch expression
                case 1 -> "That's because he has no brain.";
                case 2 -> "That's because he is a pain.";
                case 3 -> "'Cause this is the last refrain.";
                default -> "";
            });

            switch (verse) { // switch statement with fall-through
                case 3:
                    out.println("Last refrain, last refrain,");
                case 2:
                    out.println("He's a pain, he's a pain,");
                case 1:
                    out.println("Has no brain, has no brain,");
            }
            out.println("""
                    In the rain, in the rain.
                    Oh, oh, oh, oh""");
            out.println();
        }
        out.println(intro);
        out.println();

        /*Output:

        Al's all wet. Oh, why is Al all wet? Oh,
        Al's all wet 'cause he's standing in the rain.
        Why is Al out in the rain?
        That's because he has no brain.
        Has no brain, has no brain,
        In the rain, in the rain.
        Oh, oh, oh, oh

        Al's all wet. Oh, why is Al all wet? Oh,
        Al's all wet 'cause he's standing in the rain.
        Why is Al out in the rain?
        That's because he is a pain.
        He's a pain, he's a pain,
        Has no brain, has no brain,
        In the rain, in the rain.
        Oh, oh, oh, oh

        Al's all wet. Oh, why is Al all wet? Oh,
        Al's all wet 'cause he's standing in the rain.
        Why is Al out in the rain?
        'Cause this is the last refrain.
        Last refrain, last refrain,
        He's a pain, he's a pain,
        Has no brain, has no brain,
        In the rain, in the rain.
        Oh, oh, oh, oh

        Al's all wet. Oh, why is Al all wet? Oh,
        Al's all wet 'cause he's standing in the rain.*/


        // .............................................................................................................
        // FOR AMOUR:
        for (int i = 0, j = 10; i < j; i++, j--) {
            out.println(i + " " + j);
        }
        out.println();

            /* Output:
            0 10
            1 9
            2 8
            3 7
            4 6*/

        // .............................................................................................................
        // COLLECTING VALUES: accumulator
        int total = 0;

        for (int n = 0; n < 10; n++) {
            total += n;
            out.println("When n = " + n + ", the accumulated sum is " + total);
        }
        out.println("Total: " + total);
        out.println();

        /* Output:
        When n = 0, the accumulated sum is 0
        When n = 1, the accumulated sum is 1
        When n = 2, the accumulated sum is 3
        When n = 3, the accumulated sum is 6
        When n = 4, the accumulated sum is 10
        When n = 5, the accumulated sum is 15
        When n = 6, the accumulated sum is 21
        When n = 7, the accumulated sum is 28
        When n = 8, the accumulated sum is 36
        When n = 9, the accumulated sum is 45
        Total: 45
        */

        // .............................................................................................................
        // FACTORIAL:

        /*Write a program in which the user types a positive int value (call it x), and Java
        displays the value of x! as its output.*/

        keyboard = new Scanner(in);
        out.println("Enter a positive integer number (x), please.");
        int x = keyboard.nextInt();
        int factorial = 1;

        for (int z = 1; z <= x; z++) {
            factorial *= z;
        }

        out.println(x + " factorial equals to: " + factorial);

        out.println();
        keyboard.close();

        // .............................................................................................................

        // SEEING STARS:
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                out.print("*");
            }
            out.println();
        }
    }
}
