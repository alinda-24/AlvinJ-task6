import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class CardGame extends CasinoGame {
    private List<Card> deck;
    private Random random;
    private Scanner scanner;

    public CardGame() {
        gameName = "Higher or Lower Card Game";
        random = new Random();
        scanner = new Scanner(System.in);
        initDeck();
    }

    private void initDeck() {
        deck = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            deck.add(new Card(i));
        }
        Collections.shuffle(deck);
    }

    public void play() {
        welcomeMessage();
        Iterator<Card> iterator = deck.iterator();
        if (!iterator.hasNext()) return;

        Card currentCard = iterator.next();
        while (iterator.hasNext()) {
            System.out.println("Current Card: " + currentCard.getValue());
            System.out.print("Will the next card be higher or lower? (Enter 'h' or 'l'): ");
            char guess = scanner.next().charAt(0);

            Card nextCard = iterator.next();
            iterator.remove(); // Remove the dealt card from the deck
            System.out.println("Next Card: " + nextCard.getValue());

            if ((guess == 'h' && nextCard.getValue() > currentCard.getValue()) || 
                (guess == 'l' && nextCard.getValue() < currentCard.getValue())) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! Game over.");
                break;
            }
            currentCard = nextCard;
        }
    }

    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.play();
    }
}