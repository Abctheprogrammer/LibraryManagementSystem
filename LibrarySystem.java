import java.util.Scanner;

public class LibrarySystem {

    static Library library = new Library();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Sample data
        library.addBook(new Book("101", "Effective Java", "Joshua Bloch", "Programming"));
        library.addBook(new Book("102", "Clean Code", "Robert Martin", "Programming"));
        library.addMember(new Member("M01", "Alice", "9876543210"));

        int choice;

        do {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Display All Books");
            System.out.println("2. Display Available Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    library.displayAllBooks();
                    break;

                case 2:
                    library.displayAvailableBooks();
                    break;

                case 3:
                    System.out.print("Enter Member ID: ");
                    String mid = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String isbn = sc.nextLine();

                    Member m = library.findMemberById(mid);
                    Book b = library.findBookByIsbn(isbn);

                    if (m != null && b != null && m.borrowBook(b)) {
                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Borrow failed!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Member ID: ");
                    mid = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    isbn = sc.nextLine();

                    m = library.findMemberById(mid);
                    b = library.findBookByIsbn(isbn);

                    if (m != null && b != null && m.returnBook(b)) {
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Return failed!");
                    }
                    break;

                case 5:
                    System.out.print("Enter keyword: ");
                    String key = sc.nextLine();
                    library.searchBooks(key).forEach(Book::displayInfo);
                    break;

                case 6:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}