import java.util.Scanner;

public class MainLibraryManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Author authorBook = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist and short story writer.");

        authorBook.displayInfo();

        // Do not close Scanner as per instructions
    }
}
