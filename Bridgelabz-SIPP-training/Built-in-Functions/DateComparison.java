import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Problem 4: Date Comparison");
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String firstDateStr = s.nextLine();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String secondDateStr = s.nextLine();
        LocalDate firstDate, secondDate;
        try {
            firstDate = LocalDate.parse(firstDateStr);
            secondDate = LocalDate.parse(secondDateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter dates as yyyy-MM-dd.");
            return;
        }
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }
    }
}
