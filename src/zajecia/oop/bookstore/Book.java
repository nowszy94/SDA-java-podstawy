package zajecia.oop.bookstore;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Szymon on 2017-04-24.
 */
public class Book {
    public String title;
    public String description;
    public String author;
    public String releaseDate;
    public int size;
    public String ISBN;
    public String[] content;

    public Book(String title, String author, String releaseDate, String ISBN) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.ISBN = ISBN;
        this.description = "To be updated";
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
