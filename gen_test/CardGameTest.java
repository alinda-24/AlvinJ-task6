package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardGameTest {
    private CardGame cardGame;
    private List<Card> deck;

    @Before
    public void setUp() {
        cardGame = new CardGame();
        deck = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            deck.add(new Card(i));
        }
        Collections.shuffle(deck);
    }

    @Test
    public void testDeckInitialization() {
        List<Card> cards = cardGame.getDeck();
        assertEquals(52, cards.size());

        // Ensure all values are present
        boolean[] found = new boolean[53];
        for (Card card : cards) {
            found[card.getValue()] = true;
        }

        for (int i = 1; i <= 52; i++) {
            assertTrue("Value " + i + " should be in the deck.", found[i]);
        }
    }

    @Test
    public void testPlayGameCorrectGuess() {
        // Simulate a sequence where guesses are known
        cardGame.setDeck(deck); // Assume method to set deck exists for testing
        // Force scanner input to be 'h' or 'l' based on pre-determined sequence
        Scanner simulatedScanner = new Scanner("h\nl\nh\n"); 
        cardGame.setScanner(simulatedScanner); // Assume method to set scanner exists
        cardGame.play();

        // Verify some expected outcomes based on chosen forced sequence
        // Use mocks/spies here to check if correct() method is called
    }

    @Test
    public void testPlayGameIncorrectGuess() {
        // Intentional bad setup to test failure path
        cardGame.setDeck(deck);
        Scanner simulatedScanner = new Scanner("h\nh\nh\n"); 
        cardGame.setScanner(simulatedScanner);
        cardGame.play();
        
        // Verify that the game stops after a wrong guess
        // Use mocks/spies here to check if wrong() method is called
    }
}

class CardGame {
    private List<Card> deck;
    private Random random;
    private Scanner scanner;
    protected String gameName;

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
        // Assume play logic here
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void welcomeMessage() {
        System.out.println("Welcome to " + gameName + "!");
    }
}

class Card {
    private int value;

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}