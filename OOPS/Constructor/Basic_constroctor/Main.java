public class Main  {
    public static void main(String[] args) {
        // Book
        Book book1 = new Book();
        Book book2 = new Book("Java Basics", "John Doe", 399.99);

        // Circle
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);

        // Person
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1);  // Copy constructor

        // HotelBooking
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking("Bob", "Deluxe", 3);
        HotelBooking booking3 = new HotelBooking(booking2);  // Copy

        // LibraryBook
        LibraryBook libBook = new LibraryBook("C++ Primer", "Stanley B. Lippman", 499.50);
        libBook.borrowBook();
        libBook.borrowBook(); // Try borrowing again

        // CarRental
        CarRental rental = new CarRental("Charlie", "Swift", 5);
        System.out.println("Total rental cost for " + rental.customerName + " is ₹" + rental.calculateTotalCost());
    }
}