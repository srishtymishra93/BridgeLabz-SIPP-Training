     public class BookMain {
    public static void main(String[] args) {
        // Create a Book object
        Book b1 = new Book("978-3-16-148410-0", "Java Fundamentals", "John Doe");
        b1.displayBookDetails();

        // Update author
        b1.setAuthor("Jane Smith");
        System.out.println("\nUpdated Author: " + b1.getAuthor());

        System.out.println("\n---------------------------");

        // Create an EBook object
        EBook eb1 = new EBook("978-0-13-468599-1", "Effective Java", "Joshua Bloch", 2.5);
        eb1.displayEBookDetails();
    }
}

