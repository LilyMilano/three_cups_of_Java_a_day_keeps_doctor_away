package Java_Barry_Burd.chapter15.frame;
import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape{
    public Circle(int size, Color color, boolean isFilled) {
        super(size, color, isFilled);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        if (isFilled) {
            g.fillOval(size/2, size/2, size, size);
        } else {
            g.drawOval(size/2, size/2, size, size);
        }
    }

}