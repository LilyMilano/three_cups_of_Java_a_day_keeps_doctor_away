package Java_Barry_Burd.chapter16.games;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameFrame4 extends JFrame {

    int randomNumber = new Random().nextInt(10) + 1;
    int numGuesses = 0;

    JTextField textField = new JTextField(5);
    JButton button = new JButton("Guess");
    JLabel label = new JLabel(numGuesses + " guesses");

    public GameFrame4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        add(button);
        add(label);
        button.addActionListener(e -> {

                String textFieldText = textField.getText();

                if(Integer.parseInt(textFieldText) == randomNumber) {
                    button.setEnabled(false);
                    textField.setText(textFieldText + " Yes!");
                    textField.setEnabled(false);
                } else {
                    textField.setText("");
                    textField.requestFocus();
                }
                numGuesses++;
                String guessWord = (numGuesses == 1) ? " guess" : " guesses";
                label.setText(numGuesses + guessWord);

        });
        pack();
        setVisible(true);
    }
}
