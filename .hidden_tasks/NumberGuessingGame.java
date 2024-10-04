public class NumberGuessingGame extends CasinoGame {
    private int numberToGuess;
    private Random random;
    private Scanner scanner;

    public NumberGuessingGame() {
        gameName = "Number Guessing Game";
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void play() {
        welcomeMessage();
        numberToGuess = random.nextInt(100) + 1;
        int userGuess;

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            String feedback = userGuess == numberToGuess ? "Correct!" : (userGuess < numberToGuess ? "Higher!" : "Lower!");
            System.out.println(feedback);
        } while (userGuess != numberToGuess);

        System.out.println("Congratulations! You've guessed the number!");
    }

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.play();
    }
}

// CardGame.java extension for exercise 6
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Card {
    private int value;

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}