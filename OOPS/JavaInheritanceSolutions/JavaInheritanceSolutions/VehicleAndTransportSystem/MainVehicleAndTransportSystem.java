import java.util.Scanner;

public class MainVehicleAndTransportSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        for (Vehicle v : vehicles) {
            System.out.println("-----");
            v.displayInfo();
        }

        // Do not close Scanner as per instructions
    }
}
