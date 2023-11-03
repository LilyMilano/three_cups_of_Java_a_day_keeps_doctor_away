package Java_Barry_Burd.chapter14.com.music.artist;
import Java_Barry_Burd.chapter14.com.music.item.Item;
import java.util.ArrayList;

public class Artist {
    // Fields:
    private String name;
    private ArrayList<Item> items;

    // Constructor:
    public Artist(String name){
        this.name = name;
        this.items = new ArrayList<>();
    }

    // Getters and Setters:
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
