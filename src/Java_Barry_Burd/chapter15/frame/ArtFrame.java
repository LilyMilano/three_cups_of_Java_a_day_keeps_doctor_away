package Java_Barry_Burd.chapter15.frame;

import javax.swing.*;
import java.awt.*;

public class ArtFrame extends JFrame {
    Shape shape;

    public ArtFrame(Shape shape){
        this.shape = shape;
        setTitle("Abstract Art");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        shape.paint(g);
    }
}
