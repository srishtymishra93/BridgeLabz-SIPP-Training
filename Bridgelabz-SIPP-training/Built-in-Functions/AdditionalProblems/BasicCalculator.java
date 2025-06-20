import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Basic Calculator");
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();
        s.nextLine(); // consume newline
        System.out.print("Choose operation (+, -, *, /): ");
        String op = s.nextLine();

        double result;
        switch (op) {
            case "+":
                result = add(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }
        System.out.println("Result: " + result);
    }

    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
}
