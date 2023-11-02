package Java_Barry_Burd.chapter14.practices.display;

import Java_Barry_Burd.chapter14.com.burdbrain.drawings.DrawingWideBB;
import Java_Barry_Burd.chapter14.com.burdbrain.frames.ArtFrame;

public class ShowFrame {
    public static void main(String[] args) {
        ArtFrame artFrame = new ArtFrame(new DrawingWideBB());

        artFrame.setSize(200,100);
        artFrame.setVisible(true);
    }
}
