import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeProblems {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Problem 1: Time Zones and ZonedDateTime
        System.out.println("Problem 1: Current time in different time zones:");
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
        System.out.println();

        // Problem 2: Date Arithmetic
        System.out.println("Problem 2: Date Arithmetic");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDateStr = s.nextLine();
        LocalDate inputDate;
        try {
            inputDate = LocalDate.parse(inputDateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter date as yyyy-MM-dd.");
            s.close();
            return;
        }
        LocalDate resultDate = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Resulting date after adding 7 days, 1 month, 2 years and subtracting 3 weeks: " + resultDate);
        System.out.println();

        // Problem 3: Date Formatting
        System.out.println("Problem 3: Date Formatting");
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("dd/MM/yyyy: " + currentDate.format(format1));
        System.out.println("yyyy-MM-dd: " + currentDate.format(format2));
        System.out.println("EEE, MMM dd, yyyy: " + currentDate.format(format3));
        System.out.println();

        // Problem 4: Date Comparison
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
            s.close();
            return;
        }
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }
        s.close();
    }
}
