package Java_Barry_Burd.chapter10.mens_clothing;

import javax.swing.*;
import java.awt.*;

public class ClothingFrame extends JFrame {
    public ClothingFrame() {
        MensClothingItem item; // Declaration of instances

        item = new MensClothingItem(MensClothingKind.PANTS, "Casual #1");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.SHIRTS, "Casual #2");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.JACKETS, "Casual #3");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.NECKTIES, "Casual #4");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.OVERCOATS, "Casual #5");
        addItemInfo(item);
        item = new MensClothingItem(MensClothingKind.SHOES, "Casual #6");
        addItemInfo(item);

        // Setting the frame:
        setTitle("Men's Clothing");
        setLayout(new GridLayout(6,2,20,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    void addItemInfo(MensClothingItem item) {
        add(new JLabel("    " + item.getKind()));
        add(new JLabel(item.getName()));
    }
}
