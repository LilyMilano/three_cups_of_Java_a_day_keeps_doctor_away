package Java_Barry_Burd.chapter14.com.burdbrain.practice;
import Java_Barry_Burd.chapter14.com.burdbrain.drawings.DrawingWide;
import Java_Barry_Burd.chapter14.com.burdbrain.frames.ArtFrame;
public class ShowFrameWide {
    public static void main(String[] args) {
        ArtFrame artFrame = new ArtFrame(new DrawingWide());

        artFrame.setSize(200, 100);
        artFrame.setVisible(true);
    }
}
