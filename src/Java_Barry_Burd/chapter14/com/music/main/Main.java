package Java_Barry_Burd.chapter14.com.music.main;
import Java_Barry_Burd.chapter14.com.music.album.Album;
import Java_Barry_Burd.chapter14.com.music.artist.Artist;
import Java_Barry_Burd.chapter14.com.music.playlist.Playlist;
import Java_Barry_Burd.chapter14.com.music.song.Song;

public class Main {
    public static void main(String[] args) {

        // Create an artist:....................................................
        Artist artist = new Artist("Shakira");

        // Create songs:........................................................
        Song song1 = new Song("Empire", artist, Song.Genre.ROCK);
        Song song2 = new Song("Objection", artist, Song.Genre.POP);

        // Create an album:.....................................................
        Album album = new Album("Laundry Service", artist);
        album.getSongs().add(song1);
        album.getSongs().add(song2);

        // Create a playlist:...................................................
        Playlist playlist = new Playlist();
        playlist.getItems().add(new Song("Medicine", artist, Song.Genre.COUNTRY));
        playlist.getItems().add(album);

        // Display information:.................................................
        System.out.println("Artist: " + artist.getName());
        System.out.println("Songs in Album: " + album.getSongs().size());
        System.out.println("Items in Playlist: " + playlist.getItems().size());
    }
}
