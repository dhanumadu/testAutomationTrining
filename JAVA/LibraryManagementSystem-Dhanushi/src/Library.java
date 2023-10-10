import java.util.ArrayList;
import java.util.List;

public class Library{
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByIsbn(long isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        throw new BookNotFoundException(isbn);
    }

    public static int getTotalLibraryBooks() {
        return Book.getTotalBooks();
    }
}
