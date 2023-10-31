package Java_Barry_Burd.chapter14.com.burdbrain.frames;

import Java_Barry_Burd.chapter14.com.burdbrain.drawings.Drawing;

import javax.swing.JFrame;
import java.awt.*;

public class ArtFrame extends JFrame {

    Drawing drawing;

    public ArtFrame(Drawing drawing) {
        this.drawing = drawing;
        setTitle("Abstract Art");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void paint(Graphics g) {
        drawing.paint(g);
    }
}
