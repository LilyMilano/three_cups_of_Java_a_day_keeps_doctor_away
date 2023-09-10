package Java_Barry_Burd.chapter10.mens_clothing;

import javax.swing.*;
import java.awt.*;

public class ClothingFramePlus extends JFrame {

    public ClothingFramePlus(){
        MensClothingItemPlus item;

        add(new JLabel(MensClothingItemPlus.designer));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));

        double totalCost = 0;

        item = new MensClothingItemPlus(MensClothingKind.PANTS, "Design #1", Color.BLACK, 70.00);
        addItemInfo(item);
        totalCost += item.getItemCost();

        item = new MensClothingItemPlus(MensClothingKind.SHIRTS, "Design #2", Color.WHITE, 50.00);
        addItemInfo(item);
        totalCost += item.getItemCost();

        item = new MensClothingItemPlus(MensClothingKind.NECKTIES, "Design #3", Color.GRAY, 30.00);
        addItemInfo(item);
        totalCost += item.getItemCost();

        item = new MensClothingItemPlus(MensClothingKind.JACKETS, "Design #4", Color.DARK_GRAY, 70.00);
        addItemInfo(item);
        totalCost += item.getItemCost();

        item = new MensClothingItemPlus(MensClothingKind.OVERCOATS, "Design #5", Color.DARK_GRAY, 100.00);
        addItemInfo(item);
        totalCost += item.getItemCost();

        item = new MensClothingItemPlus(MensClothingKind.SHOES, "Design #6", Color.BLACK, 80.00);
        addItemInfo(item);
        totalCost += item.getItemCost();

        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(" "));
        add(new JLabel(Double.toString(totalCost)));

        // Setting frame:
        setTitle("Men's Clothing");
        setLayout(new GridLayout(8, 4, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    void addItemInfo(MensClothingItemPlus item){
        add(new JLabel("  " + item.getKind()));
        add(new JLabel(item.getName()));
        add(new JLabel(item.getColor().toString()));
        add(new JLabel(Double.toString(item.getItemCost())));
    }
}
