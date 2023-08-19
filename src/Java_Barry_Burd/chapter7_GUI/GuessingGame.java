package Java_Barry_Burd.chapter7_GUI;

import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        PracticeFrame frame  = new PracticeFrame("Guessing Game");
        frame.addRow("Enter an int from 1 to 10");
        frame.setButtonText("Submit your guess");
        frame.go();
    }
    public static String calculate(int inputNumber){
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        if(inputNumber == randomNumber){
            return "You win.";
        } else {
            return "You lose. The random number was " + randomNumber + ".";
        }
    }
}
