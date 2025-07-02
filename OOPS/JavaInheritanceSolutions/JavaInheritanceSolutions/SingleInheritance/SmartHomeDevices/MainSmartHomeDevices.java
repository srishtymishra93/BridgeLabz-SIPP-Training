import java.util.Scanner;

public class MainSmartHomeDevices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Thermostat thermostat = new Thermostat("T1001", "On", 22.5);

        thermostat.displayStatus();

        // Do not close Scanner as per instructions
    }
}
