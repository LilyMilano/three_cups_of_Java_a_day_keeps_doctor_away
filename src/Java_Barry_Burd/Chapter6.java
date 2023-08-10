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
        for (int row = 0; row < 5; row++) {     // This is the outer for loop that iterates 5 times, with row taking values 0 through 4. This will control the number of rows printed.
            for (int column = 0; column < 5; column++) {    // This is the inner for loop that iterates 5 times for each iteration of the outer loop. The column variable takes values 0 through 4. This will control the number of columns printed.
                out.print("*");     // This prints a single "*" character without a newline. This will print a star for each column.
            }
            out.println();      // This prints a newline after each row is completed.
        }
        out.println();
        /*
            Output:

            *****
            *****
            *****
            *****
            *****

            So for each iteration of the outer loop (each row), the inner loop will print 5 stars (columns).
            Then a newline is printed to start a new line for the next row.
            The outer loop executes 5 times to print 5 rows. The inner loop prints 5 columns per row.
            So the end result is a 5x5 grid of stars, with each row on a new line.

            */
        // .............................................................................................................
        // SEEING MORE AND MORE STARS:

        for (int row = 0; row < 5; row++) {    // This declares a for loop with the variable row that will iterate from 0 up to but not including 5.
            for (int column = 0; column <= row; column++) {     // This declares another for loop nested inside the first one. This loop iterates over the variable column from 0 up to and including the current value of row.
                System.out.print("*");  // This prints out a * character without a newline.
            }
            System.out.println();   // This prints out a newline character after each full row is printed.
        }

        out.println();

        /*
            Output:

            *
            **
            ***
            ****
            *****

            So for each iteration of the outer loop row (from 0 to 4), the inner loop column will print out a
            number of * characters from 0 up to the value of row. Then a newline is printed to end that row.
            The end result is it prints out a triangle pattern of asterisks of increasing length on each line.

            */

        // .............................................................................................................
        // THREE TRIANGLES:
        /*Write a program that uses loops to display three copies of the following pattern,
        one after another:

        *****
        ****
        ***
        **
        *

        */

        for (int copy = 0; copy < 3; copy++) {      // This starts an outer loop that will repeat 3 times, with copy as the loop variable starting at 0.
            for (int row = 0; row < 5; row++) {     // This starts a loop for each row of the triangle, with row as the loop variable from 0 to 4.
                for (int column = 0; column <= 4 - row; column++) {     // This starts a loop for each column, printing from 0 to 4 minus the current row value. This prints the appropriate number of asterisks for that row.
                    System.out.print("*");          // This prints an asterisk without a newline.
                }
                System.out.println();
            }
        }
        out.println();

        /* Explanation:

        So for each of the 3 copies, it will print a 5 row triangle pattern by printing the
        appropriate number of asterisks per row.
        The 4 here is because the full triangle is 5 rows tall. Since it starts from 0, the last row is row 4.

        By subtracting the current row number, we get the number of asterisks to print for that row:

        On row 0, 4 - 0 = 4 (0, 1, 2, 3, 4) > 5 asterisks
        On row 1, 4 - 1 = 3 (0, 1, 2, 3) > 4 asterisks
        On row 2, 4 - 2 = 2 (0, 1, 2) > 3 asterisks
        On row 3, 4 - 3 = 1 (0, 1) > 2 asterisk
        On row 4, 4 - 4 = 0 (0) > 1 asterisks (loop ends immediately)

        Output:

        *****  // Row 0 (5 asterisks)
        ****   // Row 1 (4 asterisks)
        ***    // Row 2 (3 asterisks)
        **     // Row 3 (2 asterisks)
        *      // Row 4 (1 asterisk)
        *****
        ****
        ***
        **
        *
        *****
        ****
        ***
        **
        *

        */
    }
}
