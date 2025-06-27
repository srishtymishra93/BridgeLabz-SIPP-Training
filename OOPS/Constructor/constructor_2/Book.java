public class Book  {
    public String ISBN;                 
    protected String title;     
    private String author;      

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}
