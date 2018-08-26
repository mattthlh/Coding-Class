import java.util.HashMap;

public class Library {
    private Book bookName;
    private HashMap<Book, Book> library;
    public void library() {
        HashMap<Book, Book> library = new HashMap<>();
        this.library = library;
    }

    public void addBook(Book bookName) {
        this.bookName = bookName;
        library.put(this.bookName, this.bookName);
    }

    public void removeBook(Book bookName) {
        this.bookName = bookName;
        library.remove(this.bookName);
    }

    public HashMap bookList() {
        return library;
    }
    public Book findBook(Book bookName) {
        this.bookName = bookName;
        return this.bookName;
    }
}