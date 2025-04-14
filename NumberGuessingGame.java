import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int guess;
        int attempts = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");

        while (true) {
            System.out.print("🔢 Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! 📉 Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! 📈 Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed it in " + attempts + " tries!");
                break;
            }
        }

        scanner.close();
    }
}
