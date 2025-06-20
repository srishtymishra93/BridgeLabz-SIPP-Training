import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms = s.nextInt();

        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        printFibonacci(terms);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : "\n"));
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
