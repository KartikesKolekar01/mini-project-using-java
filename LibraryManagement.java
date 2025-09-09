import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    int bookId;
    String bookTitle;
    String authorName;
    int quantity;

    public Book(int bookId, String bookTitle, String authorName, int quantity) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + bookTitle + ", Author: " + authorName + ", Quantity: " + quantity;
    }
}

// Library Management Class
public class LibraryManagement {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public static void addBook() {
        System.out.print("Enter the Book Id: ");
        int bookId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter the Book Title: ");
        String bookTitle = sc.nextLine();

        System.out.print("Enter the Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter the Quantity: ");
        int quantity = sc.nextInt();

        Book b = new Book(bookId, bookTitle, authorName, quantity);
        books.add(b);
        System.out.println("Book added successfully.");
    }

    // View All Books
    public static void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Are Available.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // Issue Book
    public static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int bookId = sc.nextInt();
        System.out.print("Enter your Student/Member ID: ");
        int memberId = sc.nextInt();

        System.out.println("Book with ID " + bookId + " has been issued to Member ID " + memberId + ".");
    }

    // Return Book
    public static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int bookId = sc.nextInt();
        System.out.print("Enter your Student/Member ID: ");
        int memberId = sc.nextInt();

        System.out.println("Book with ID " + bookId + " has been returned by Member ID " + memberId + ".");
    }

    // Main method
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== RIT Library Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    issueBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Thank you for using our Library System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
