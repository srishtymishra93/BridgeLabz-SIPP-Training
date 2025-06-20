import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = s.nextInt();

        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
