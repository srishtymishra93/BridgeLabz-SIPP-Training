public class EBook extends Book {
    private double fileSizeMB;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN       : " + ISBN);    
        System.out.println("Title      : " + title);     
        // System.out.println("Author   : " + author);  
        System.out.println("File Size  : " + fileSizeMB + " MB");
        System.out.println("Author     : " + getAuthor()); 
    }
}
