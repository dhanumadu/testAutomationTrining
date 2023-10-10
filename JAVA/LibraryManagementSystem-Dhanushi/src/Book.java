public class Book {
    private String title;
    private String author;
    private long isbn;
    private boolean isBorrowed;
    private static int totalBooks = 0;

    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
        totalBooks++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void setTotalBooks(int totalBooks) {
        Book.totalBooks = totalBooks;
    }

    public boolean borrowBook() {
        if (isBorrowed==false) {
            isBorrowed = true;
            return true;
        } else {
            return false;
        }
    }
    public boolean returnBook() {
        if (isBorrowed == true) {
            isBorrowed = false;
            return true;
        } else {
            return false;
        }
    }
}
