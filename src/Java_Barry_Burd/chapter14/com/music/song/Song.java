package Java_Barry_Burd.chapter14.com.music.song;

import Java_Barry_Burd.chapter14.com.music.artist.Artist;
import Java_Barry_Burd.chapter14.com.music.item.Item;

public class Song extends Item {

    public enum Genre {
        ROCK, POP, COUNTRY, CLASSICAL
    }

    // Field:
    private Genre genre;

    // Constructor:
    public Song(String name, Artist artist, Genre genre) {
        super(name, artist);
        this.genre = genre;
    }

    // Getter and Setter:
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
