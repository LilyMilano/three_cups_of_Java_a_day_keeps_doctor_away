package Java_Barry_Burd.chapter15.frame;
import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape{
    public Square(int size, Color color, boolean isFilled) {
        super(size, color, isFilled);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        if (isFilled) {
            g.fillRect(size/2, size/2, size, size);
        } else {
            g.drawRect(size/2, size/2, size, size);
        }
    }

}

