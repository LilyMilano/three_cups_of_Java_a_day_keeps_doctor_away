package Java_Barry_Burd.chapter15.frame;
import java.awt.Color;
import java.awt.Graphics;

abstract public class Shape {
    int size;
    Color color;
    boolean isFilled;

    public Shape(int size, Color color, boolean isFilled) {
        this.size = size;
        this.color = color;
        this.isFilled = isFilled;
    }

    abstract public void paint(Graphics g);
}
