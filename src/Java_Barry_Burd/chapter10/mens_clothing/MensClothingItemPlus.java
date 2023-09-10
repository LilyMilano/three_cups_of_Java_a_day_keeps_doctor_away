package Java_Barry_Burd.chapter10.mens_clothing;

import java.awt.*;

public class MensClothingItemPlus extends MensClothingItem{

    // Declaration of Fields:
    public static String designer = "House of Fashion";
    private Color color;
    private double itemCost;

    // Constructor:
    public MensClothingItemPlus(MensClothingKind kind, String name, Color color, double itemCost){
        super(kind, name);
        this.color = color;
        this.itemCost = itemCost;
    }

    // Getters and setters:
    public Color getColor(){
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public double getItemCost() {
        return itemCost;
    }
    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }
}
