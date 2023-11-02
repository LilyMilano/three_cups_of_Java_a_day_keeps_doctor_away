package Java_Barry_Burd.chapter14.com.bookstore.books;

public class Book {

    // Fields
    private String title;
    private Author author;

    // Constructor:
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    // Getters and Setters:
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
}
