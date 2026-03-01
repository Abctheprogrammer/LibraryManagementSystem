public class Book {

    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean isAvailable;

    // Constructor
    public Book(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = true;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Display book details
    public void displayInfo() {
        System.out.println("ISBN   : " + isbn);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Genre  : " + genre);
        System.out.println("Status : " + (isAvailable ? "Available" : "Borrowed"));
        System.out.println("--------------------------------");
    }
}