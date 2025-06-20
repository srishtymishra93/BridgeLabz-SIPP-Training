import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = s.nextDouble();
        System.out.print("Convert to (C/F): ");
        String choice = s.next();

        if (choice.equalsIgnoreCase("C")) {
            System.out.println(temp + " Fahrenheit is " + fahrenheitToCelsius(temp) + " Celsius.");
        } else if (choice.equalsIgnoreCase("F")) {
            System.out.println(temp + " Celsius is " + celsiusToFahrenheit(temp) + " Fahrenheit.");
        } else {
            System.out.println("Invalid choice. Please enter 'C' or 'F'.");
        }
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
