import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = getInput(s, "Enter first number: ");
        int num2 = getInput(s, "Enter second number: ");
        int num3 = getInput(s, "Enter third number: ");

        int max = findMax(num1, num2, num3);
        System.out.println("The maximum of the three numbers is: " + max);
    }

    public static int getInput(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
