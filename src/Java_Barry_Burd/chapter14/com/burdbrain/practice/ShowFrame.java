package Java_Barry_Burd.chapter14.com.burdbrain.practice;
import Java_Barry_Burd.chapter14.com.burdbrain.drawings.Drawing;
import Java_Barry_Burd.chapter14.com.burdbrain.frames.ArtFrame;

import java.awt.*;

public class ShowFrame {    // Displaying a frame
    public static void main(String[] args) {
        ArtFrame artFrame;
        artFrame = new ArtFrame(new Drawing());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);

    }
}
