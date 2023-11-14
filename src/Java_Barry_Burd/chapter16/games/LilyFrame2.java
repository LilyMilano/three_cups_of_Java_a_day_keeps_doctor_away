package Java_Barry_Burd.chapter16.games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LilyFrame2 extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;
    String textFieldInput = null;

    JTextField textField = new JTextField(5);
    JLabel label = new JLabel(textFieldInput);

    public LilyFrame2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        textField.addKeyListener(this);
        add(label);
        pack();
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textFieldInput = textField.getText();
        label.setText(textFieldInput);
    }
}
