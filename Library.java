import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Member> members;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    // Add book
    public void addBook(Book book) {
        books.add(book);
    }

    // Add member
    public void addMember(Member member) {
        members.add(member);
    }

    // Find book by ISBN
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    // Find member by ID
    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Search books
    public ArrayList<Book> searchBooks(String keyword) {
        ArrayList<Book> result = new ArrayList<>();
        keyword = keyword.toLowerCase();

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword) ||
                book.getAuthor().toLowerCase().contains(keyword) ||
                book.getGenre().toLowerCase().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    // Display all books
    public void displayAllBooks() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    // Display available books
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }
}