import java.util.Scanner;

public class LibraryDemo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create libraries
        Library library1 = new Library();
        Library library2 = new Library();

        // Add books to libraries (aggregation)
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        // Show books in each library
        System.out.println("Library 1:");
        library1.showBooks();

        System.out.println("\nLibrary 2:");
        library2.showBooks();
    }
}
