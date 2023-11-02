package Java_Barry_Burd.chapter14.com.bookstore.main;
import Java_Barry_Burd.chapter14.com.bookstore.books.Author;
import Java_Barry_Burd.chapter14.com.bookstore.books.Book;
public class Main {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("Dan Brown");
        Author author2 = new Author("Gayle Marti");

        // Create books
        Book book1 = new Book("The Da Vinci Code", author1);
        Book book2 = new Book("If I Stay", author2);

        // Add books to authors
        author1.getBooks().add(book1);
        author2.getBooks().add(book2);

        System.out.println("Book 1: '" + book1.getTitle() + "' by " + book1.getAuthor().getName());
        System.out.println("Book 2: '" + book2.getTitle() + "' by " + book2.getAuthor().getName());
    }
}
