import java.util.Scanner;

public class MainRestaurantManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Chef chef = new Chef("John", 1);
        Waiter waiter = new Waiter("Emily", 2);

        chef.performDuties();
        waiter.performDuties();


    }
}
