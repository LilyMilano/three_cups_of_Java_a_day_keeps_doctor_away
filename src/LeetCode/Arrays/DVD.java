package LeetCode.Arrays;

public class DVD {

    // Fields:
    public String name;
    public int releaseYear;
    public String director;

    // Constructor:
    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " +
                this.releaseYear;
    }
}
