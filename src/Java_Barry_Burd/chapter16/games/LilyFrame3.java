package Java_Barry_Burd.chapter16.games;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LilyFrame3 extends JFrame {
    String textFieldInput = null;

    JTextField textField = new JTextField(5);
    JButton button = new JButton("Copy");
    JLabel label = new JLabel(textFieldInput);

    public LilyFrame3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(textField);
        add(button);
        add(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldInput = textField.getText();
                label.setText(textFieldInput);
            }
        });
        pack();
        setVisible(true);
    }
}
