package zajecia.oop.bookstore;

/**
 * Created by Szymon on 2017-04-24.
 */
public class Bookstore {
    public Book[] books;
    public int numberOfBooks;

    public Bookstore() {
        this.books = new Book[100];
        this.numberOfBooks = 0;
    }

    public boolean add(Book book) {
        boolean valueToReturn = false;
        if (numberOfBooks < 100) {
            books[numberOfBooks] = book;
            numberOfBooks++;
            valueToReturn = true;
        }
        return valueToReturn;
    }

    public void showBooks() {
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public int getNumberOfBooks(String author) {
        int counter = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].author.equals(author)) {
                counter++;
            }
        }
        return counter;
    }

    public Book[] getBooks(String author) {
        Book[] booksToReturn = new Book[getNumberOfBooks(author)];
        int index = 0;
        for (int i = 0; i < this.numberOfBooks; i++) {
            if (books[i].author.equals(author)) {
                booksToReturn[index] = books[i];
                index++;
            }
        }
        return booksToReturn;
    }

    public Book getBook(String author) {
        return null;
    }


}
