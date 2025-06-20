import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        while (true) {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct): ");
            feedback = s.nextLine().trim().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number.");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please respond with 'high', 'low', or 'correct'.");
            }

            if (low > high) {
                System.out.println("Hmm, there seems to be a contradiction in your answers.");
                break;
            }
        }
        // Not closing Scanner as per previous instructions
    }

    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }
}
