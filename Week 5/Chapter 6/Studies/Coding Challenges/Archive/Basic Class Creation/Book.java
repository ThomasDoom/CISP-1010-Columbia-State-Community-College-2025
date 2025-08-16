public class Book {
    // Instance Variables
    private String title,
                   author;
    private int pages;

    // Contstructors
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Long book? " + isLongBook());
    }

    public boolean isLongBook() {
        if (pages > 300)
            return true;
        return false;
    }
}
