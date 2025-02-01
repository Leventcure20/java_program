import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;


    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book successfully added: " + book.getTitle());
    }

    public void removeBook(String title) {
            for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                System.out.println("Book removed: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
                                
    public void displayAllBooks() {
        if (books.size() == 0) {
            System.out.println("The library has no books!");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println("Book: " + books.get(i).getTitle());
            }
        }
    }
}