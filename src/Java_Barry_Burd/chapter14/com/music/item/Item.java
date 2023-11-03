package Java_Barry_Burd.chapter14.com.music.item;
import Java_Barry_Burd.chapter14.com.music.artist.Artist;

public class Item {
    // Fields:
    private String name;
    private Artist artist;

    // Constructor:
    public Item(String name, Artist artist){
        this.name = name;
        this.artist = artist;
    }

    // Getters and Setters:
    public String getName(){
        return name;
    }
    public void setName(String  name){
        this.name = name;
    }
    public Artist getArtist(){
        return artist;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
