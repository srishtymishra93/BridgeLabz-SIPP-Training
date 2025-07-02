import java.util.Scanner;

public class MainVehicleManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model S");
        PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang");

        ev.charge();
        pv.refuel();


    }
}
