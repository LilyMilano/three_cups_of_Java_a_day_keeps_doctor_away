package Java_Barry_Burd.chapter14.com.burdbrain.drawings;
import java.awt.*;

public class Drawing1 {
    public int x = 40, y = 40, width = 40, height = 40;

    enum State {
        GREEN, YELLOW, RED
    }
    State state = State.GREEN;

    public void paint(Graphics g) {
        switch (state) {
            case GREEN -> {
                showGreen(g, false);
                showYellow(g, true);
                state = State.YELLOW;
            }
            case YELLOW -> {
                showYellow(g, false);
                showRed(g, true);
                state = State.RED;
            }
            case RED -> {
                showRed(g, false);
                showGreen(g, true);
                state = State.GREEN;
            }
        }
    }

    void showGreen(Graphics g, boolean t) {
        g.setColor(t ? Color.GREEN : Color.WHITE);
        g.fillOval(x, y + 100, width, height);
    }
    void showYellow(Graphics g, boolean t) {
        g.setColor(t ? Color.YELLOW : Color.WHITE);
        g.fillOval(x, y + 50, width, height);
    }
    void showRed(Graphics g, boolean t) {
        g.setColor(t ? Color.RED : Color.WHITE);
        g.fillOval(x, y, width, height);
    }
}
