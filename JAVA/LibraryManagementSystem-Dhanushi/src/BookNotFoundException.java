public class BookNotFoundException extends Exception{
    private long isbn;

    public BookNotFoundException(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getMessage() {
        return "Book with ISBN: " + isbn + " not found!";
    }
}
