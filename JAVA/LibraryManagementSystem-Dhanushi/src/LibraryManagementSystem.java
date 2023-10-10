public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add multiple books to the library
        Book book1 = new Book("Hamlet", "William Shakespeare", 10001L);
        Book book2 = new Book("War and Peace", "Leo Tolstoy", 10002L);
        Book book3 = new Book("The Odyssey", "Homer", 10003L);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        borrowABook(library,10001L);
        borrowABook(library,10001L);
        borrowABook(library,10004L);

        // Get the total number of books in the library
        int totalLibraryBooks = Library.getTotalLibraryBooks();
        System.out.println("Total books in the library: " + totalLibraryBooks);
    }

    private static void borrowABook(Library library,long isbn) {
        try {
            Book borrowedBook = library.findBookByIsbn(isbn);
            if (borrowedBook.borrowBook()) {
                System.out.println("Book " + borrowedBook.getTitle() + " is borrowed successfully.");
            } else {
                System.out.println("Sorry, the book is currently borrowed.");
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
