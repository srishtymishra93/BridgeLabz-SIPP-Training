import java.util.Scanner;

public class MainOnlineRetailOrderManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Order order = new Order("ORD123", "2024-06-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2024-06-02", "TRACK123");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2024-06-03", "TRACK124", "2024-06-10");

        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Order Status: " + shippedOrder.getOrderStatus());
        System.out.println("Order Status: " + deliveredOrder.getOrderStatus());

        // Do not close Scanner as per instructions
    }
}
