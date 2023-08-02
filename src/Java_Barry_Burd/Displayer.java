package Java_Barry_Burd;

// Javadoc comments

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
    }
}
