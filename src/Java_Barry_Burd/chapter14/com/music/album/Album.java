package Java_Barry_Burd.chapter14.com.music.album;

import Java_Barry_Burd.chapter14.com.music.artist.Artist;
import Java_Barry_Burd.chapter14.com.music.item.Item;
import Java_Barry_Burd.chapter14.com.music.song.Song;

import java.util.ArrayList;

public class Album  extends Item {

    // Fields:
    private ArrayList<Song> songs;

    // Constructor:
    public Album(String name, Artist artist) {
        super(name, artist);
        this.songs = new ArrayList<>();
    }

    // Getter and Setter:
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}

