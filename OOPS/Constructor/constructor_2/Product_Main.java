public class Product_Main {
    public static void main(String[] args) {
        // Create Product instances
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Smartphone", 25000.0);
        Product p3 = new Product("Headphones", 1500.0);

        // Display details for each product
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        p3.displayProductDetails();
        System.out.println();

        // Display total number of products
        Product.displayTotalProducts();
    }
}
