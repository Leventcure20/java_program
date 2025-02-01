public class Book {

    private String title;
    private String author;
    private boolean isAvailable;


    public Book (String title, String author) {
        this.title = title;
        this.author = author;
        isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void borrowBook() {
        if (isAvailable) {
            System.out.println("Book " + title + " is available! Borrowing it now.");
            isAvailable = false;
        } else {
            System.out.println("Book " + title + " is not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            System.out.println("Successfully returned " + title);
            isAvailable = true;
        } else {
            System.out.println("The book " + title + " is already available.");
        }
    }

    public void displayBookDetails() {
        System.out.println("The book title is " + title);
        System.out.println("The author of the book is " + author);
        if (isAvailable) {
            System.out.println("The book is available");
        } else {
            System.out.println("The book is not available");
        }
    }
}