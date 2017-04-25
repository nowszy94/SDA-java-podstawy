package zajecia.oop.bookstore;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Szymon on 2017-04-24.
 */
public class Book {
    private String title;
    private String description;
    private String author;
    private String releaseDate;
    private int size;
    private String ISBN;
    private String[] content;

    public Book(String title, String author, String releaseDate, String ISBN) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.ISBN = ISBN;
        this.description = "To be updated";
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getSize() {
        return size;
    }

    public String getISBN() {
        return ISBN;
    }

    public String[] getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setContent(String[] content) {
        this.content = content;
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
