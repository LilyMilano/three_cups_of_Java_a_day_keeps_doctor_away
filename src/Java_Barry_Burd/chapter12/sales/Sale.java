package Java_Barry_Burd.chapter12.sales;

public class Sale {
    // Fields

    private String item;
    private double price;

    // Getters and setters

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor
    public Sale(String item, double price){
        this.item = item;
        this.price = price;
    }
}
