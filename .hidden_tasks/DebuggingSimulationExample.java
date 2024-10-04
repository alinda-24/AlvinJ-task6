import java.util.Scanner;
import java.util.Random;

public class DebuggingSimulationExample {
    private int numberToGuess;
    private Random random;
    private Scanner scanner;

    public DebuggingSimulationExample() {
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void playNumberGuessingGame() {
        numberToGuess = random.nextInt(100) + 1;
        int userGuess;
        System.out.println("Debug the Number Guessing Game!");
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            // Introduce bug: Incorrect feedback logic
            String feedback = userGuess < numberToGuess ? "Higher!" : "Lower!";
            System.out.println(feedback);
        } while (userGuess != numberToGuess);
        System.out.println("Congratulations!");

        // Fix
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            // Corrected feedback logic
            String feedback = userGuess == numberToGuess ? "Correct!" : (userGuess < numberToGuess ? "Higher!" : "Lower!");
            System.out.println(feedback);
        } while (userGuess != numberToGuess);
        System.out.println("Congratulations! You've guessed the number!");
    }

    public static void main(String[] args) {
        DebuggingSimulationExample debugging = new DebuggingSimulationExample();
        debugging.playNumberGuessingGame();
    }
}

Exercise 6: CasinoGame.java, ExtendedGameClasses.java

abstract class CasinoGame {
    protected String gameName;

    public void welcomeMessage() {
        System.out.println("Welcome to " + gameName + "!");
    }
}