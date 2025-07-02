import java.util.ArrayList;

public class ECommerceCustomer {
    private String name;
    private ArrayList<Order> orders;

    public ECommerceCustomer(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order with " + order.getProducts().size() + " products.");
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
