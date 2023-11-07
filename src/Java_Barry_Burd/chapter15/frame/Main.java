package Java_Barry_Burd.chapter15.frame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        var circle = new Circle(100, Color.BLUE, true);
        var square = new Square(200, Color.RED, false);

        var frame1 = new ArtFrame(circle);
        frame1.setSize(200, 200);
        frame1.setVisible(true);

        var frame2 = new ArtFrame(square);
        frame2.setSize(500, 500);
        frame2.setVisible(true);
    }
}