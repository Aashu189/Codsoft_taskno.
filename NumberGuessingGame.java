import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1;
        int max = 100;
        int numberToGuess = random.nextInt(max - min + 1) + min;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + min + " and " + max + ". Can you guess what it is?");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
            }
        }
        
        scanner.close();
    }
}
