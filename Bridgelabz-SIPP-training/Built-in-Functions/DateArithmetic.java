import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Problem 2: Date Arithmetic");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDateStr = s.nextLine();
        LocalDate inputDate;
        try {
            inputDate = LocalDate.parse(inputDateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter date as yyyy-MM-dd.");
            return;
        }
        LocalDate resultDate = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Resulting date after adding 7 days, 1 month, 2 years and subtracting 3 weeks: " + resultDate);
    }
}
