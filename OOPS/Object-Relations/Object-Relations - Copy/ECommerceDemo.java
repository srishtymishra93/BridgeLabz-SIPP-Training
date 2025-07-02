import java.util.Scanner;

public class ECommerceDemo {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ECommerceCustomer customer = new ECommerceCustomer("Alice");

        Product product1 = new Product("Laptop", 1200.0);
        Product product2 = new Product("Smartphone", 800.0);
        Product product3 = new Product("Headphones", 150.0);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product3);

        Order order2 = new Order();
        order2.addProduct(product2);

        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println(customer.getName() + "'s orders:");
        for (Order order : customer.getOrders()) {
            System.out.println("Order with products:");
            for (Product product : order.getProducts()) {
                System.out.println("- " + product.getName() + ": $" + product.getPrice());
            }
        }
    }
}
