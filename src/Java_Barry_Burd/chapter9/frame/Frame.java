package Java_Barry_Burd.chapter9.frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(){
        setTitle("Don't click the button!");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JButton("Panic"));
        setSize(300, 100);
        setVisible(true);

        /* Up in the Frame class, there’s only one constructor declaration. Far from
        just setting variables’ values, this constructor calls method after method from the
        Java API. */
    }
}
