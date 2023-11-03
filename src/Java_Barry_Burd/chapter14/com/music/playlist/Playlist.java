package Java_Barry_Burd.chapter14.com.music.playlist;

import Java_Barry_Burd.chapter14.com.music.item.Item;

import java.util.ArrayList;

public class Playlist {

    // Field:
    private ArrayList<Item> items;

    // Constructor:
    public Playlist(){
        this.items = new ArrayList<>();
    }

    // Getter and Setter:
    public ArrayList<Item> getItems() {
        return items;
    }
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
