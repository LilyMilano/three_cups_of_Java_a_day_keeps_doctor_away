package Java_Barry_Burd.chapter14.com.burdbrain.frames;
import Java_Barry_Burd.chapter14.com.burdbrain.drawings.Drawing1;

import javax.swing.*;
import java.awt.*;

public class ArtFrame1 extends JFrame {
    private static final long serialVersionUID = 1L;
    Drawing1 drawing1;
    public ArtFrame1(Drawing1 drawing1) {
        this.drawing1 = drawing1;
        setTitle("Abstract Art");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        drawing1.paint(g);
    }
}
