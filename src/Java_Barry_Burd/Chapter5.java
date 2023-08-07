package Java_Barry_Burd;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

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

        if (password == "swordfish") {
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

        if (password.equals("swordfish")) {
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
        out.println();
        // keyboard.close();

        /*In addition to its equals method, Java has an equalsIgnoreCase
        method. Even though
        "SWORDFISH".equals("swordfish") is false, its close cousin:
        "SWORDFISH".equalsIgnoreCase("swordfish")
        is true.

        A text block is a bunch of text surrounded on both
        sides by three double quotes (""").
        */

        // Checking username and password (authenticator):

        {
            UIManager.put("TextField.font", new Font("Dialog", Font.BOLD, 14));
        }

        String username = JOptionPane.showInputDialog("Username:");
        String passwordKey = JOptionPane.showInputDialog("Password");

        if (
                (username != null && passwordKey != null) &&
                        (
                                (username.equals("bburd") && passwordKey.equals("swordfish")) ||
                                        (username.equals("hritter") && passwordKey.equals("preakston")) ||
                                        (username.equals("lili") && passwordKey.equals("java"))
                        )
        ) {
            JOptionPane.showMessageDialog(null, "You are in.");
        } else {
            JOptionPane.showMessageDialog(null, "You are suspicious.");
        }

        /* About line "UIManager....(Is not a statement error)
        In Java, statements need to be inside a method or a code block - you can't just have a standalone statement
        like that outside of any block. Wrapping it in {} or putting it in a method fixes the issue.  */

        /*
        * JOptionPane.showInputDialog works nicely because the user’s input (username and password) are mere strings of characters.
        * If you want the user to input a number (an int or a double, for example), you have to do some extra work.
            For example, to get an int value from the user, type something like:
            int numberOfCows = Integer.parseInt(JOptionPane.showInputDialog("How many cows?")).
            The extra Integer.parseInt stuff forces your text field’s input to be an int value.
        * To get a double value from the user, type something like:
            double fractionOfHolsteins = Double.parseDouble(JOptionPane.showInputDialog("Hosteins:")).
            The extra Double.parseDouble business forces your text field’s input to be a double value.
         */

        //**************************************************************************************************************

        // Nested If Statements: Russian matryoshka nesting dolls :-)
        // Authenticator2:

        keyboard = new Scanner(in);

        out.println("Username: ");
        String user = keyboard.next();

        if (user.equals("bburd")) {
            out.println("Token: ");
            String token = keyboard.next();

            if (token.equals("swordfish")) {
                out.println("You're in.");
            } else {
                out.println("Invalid token");
            }
        } else {
            out.println("Unknown user");
        }

        // keyboard.close();

        // Exercise: I change my mind:
        /*Modify the program in Listing 5-4 so that, if the user clicks Cancel for either the
        username or the password, the program replies with a Not enough information
        message.*/

        String nickname = JOptionPane.showInputDialog("Username:");
        String tokenKey = JOptionPane.showInputDialog("Password");

        if (
                (nickname != null && tokenKey != null) &&
                        (
                                (nickname.equals("bburd") && tokenKey.equals("swordfish")) ||
                                        (nickname.equals("hritter") && tokenKey.equals("preakston")) ||
                                        (nickname.equals("lili") && tokenKey.equals("java"))
                        )
        ) {
            JOptionPane.showMessageDialog(null, "You are in.");
        } else {
            JOptionPane.showMessageDialog(null, "Not enough information.");
        }
        out.println();
        //**************************************************************************************************************

        // Choosing among many alternatives:
        // Switch statement

        keyboard = new Scanner(in);
        out.println("Which verse? ");
        int verse = keyboard.nextInt();

        switch (verse) {
            case 1 -> out.println("That's because he has no brain.");
            case 2 -> out.println("That's because he is a pain.");
            case 3 -> out.println("'Cause this is the last refrain.");
            default -> out.println("No such verse. Please try again.");
        }

        out.println("Oh, oh, oh, oh");
        out.println();

        // keyboard.close();

        //..............................................................................................................
        // With more than one value in each case of a switch statement:

        keyboard = new Scanner(in);
        out.println("Will you pay me? ");
        String reply = keyboard.next();

        switch (reply) {
            case "Yes", "YES", "Y", "y", "yes", "OK", "Okay", "okay" -> out.println("Thank you!");
            case "No", "NO", "N", "n", "no", "NOPE", "Nope", "nope" -> out.println("Thanks for nothing!");
        }

        out.println();
        keyboard.close();
    }
}





