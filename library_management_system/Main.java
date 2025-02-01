public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K. Rowling");
        book.displayBookDetails();
        book.returnBook();
        book.borrowBook();
        Library fortBendLibrary = new Library();
        fortBendLibrary.addBook(book);
        fortBendLibrary.displayAllBooks();
    }
}