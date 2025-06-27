
class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }


    void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    // Copy constructor
    LibraryBook(LibraryBook book) {
        this.title = book.title;
        this.author = book.author;
        this.price = book.price;
        this.isAvailable = book.isAvailable;
    }
}