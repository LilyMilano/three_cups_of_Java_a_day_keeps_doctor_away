package Java_Barry_Burd.chapter14.com.bookstore.books;

import java.util.ArrayList;

public class Author {

    // Fields:
    private String name;
    private ArrayList<Book> books;

    // Constructor:
    public Author(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Getters and Setters:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
