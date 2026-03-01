import java.util.ArrayList;

public class Member {

    private String memberId;
    private String name;
    private String contact;
    private ArrayList<Book> borrowedBooks;

    // Constructor
    public Member(String memberId, String name, String contact) {
        this.memberId = memberId;
        this.name = name;
        this.contact = contact;
        borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    // Borrow book
    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    // Return book
    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            return true;
        }
        return false;
    }
}