# 🎲 Simple Casino Project

Welcome to the Simple Casino Project! In this task, you'll create a simple text-based casino application in Java. The casino will feature a few different games, combining various concepts and allowing you to practice both theoretical and practical skills in Java programming.

## 🎯 Learning Objectives

1. **Understanding the Java `Random` object.**
2. **Understanding and applying the ternary operator.**
3. **Distinguishing between deep and shallow copies.**
4. **Finding and fixing bugs.**
5. **Using an Iterator to modify a collection during iteration.**
6. **(Optional) Using inheritance to avoid code duplication.**

## 🛠 Task Overview

The task is divided into six exercises, leading you step-by-step to build a simple casino with different games. Each exercise will increase in complexity, challenging you to deepen your understanding of Java.

## 📚 Exercises

### Exercise 1: 🎲 Theoretical Exploration of the `Random` Object & Ternary Operator

**Conceptual Focus:**

- **Java `Random` Object:** Explain how the `Random` object in Java works. Discuss ways it can be used to generate various types of random values.
- **Ternary Operator:** What is the ternary operator in Java? Provide examples of its usage, and discuss its similarities and differences with an if-else statement.

**Task:**
Write a detailed explanation (500-1000 words) covering the above points. Provide code snippets for each concept to illustrate your explanation.

---

### Exercise 2: 🤔 Deep and Shallow Copy

**Conceptual Focus:**

- **Deep vs. Shallow Copy:** Discuss the differences between deep and shallow copies in Java. Use examples to highlight situations where each type of copy might be necessary.

**Task:**
Write a short essay (500-1000 words) explaining deep and shallow copies. Include code examples that demonstrate each type of copy in action, and discuss potential pitfalls or bugs that can arise from their misuse.

---

### Exercise 3: 🎰 Building a Casino Game - 'Number Guessing Game'

**Practical Application:**

- **Utilizing `Random` and Ternary Operator.**

**Instructions:**

1. Create a class `NumberGuessingGame`. Inside this class, use a `Random` object to generate a random number between 1 and 100.
2. Implement a method `play()` which:
   - Prompts the user to guess the number.
   - Utilizes the ternary operator to provide feedback: "Higher", "Lower", or "Correct!" depending on the guess.
3. Loop until the user guesses the number correctly.

_Example Code Snippet:_

```java
Random random = new Random();
int numberToGuess = random.nextInt(100) + 1;
// Usage of the ternary operator for feedback in your logic
String feedback = userGuess == numberToGuess ? "Correct!" : (userGuess < numberToGuess ? "Higher" : "Lower");
```

---

### Exercise 4: 🃏 Implement a Simple Card Game - 'Higher or Lower'

**Practical Application:**

- **Using iterations and collections.**

**Instructions:**

1. Create a class `CardGame` that uses a deck of cards represented as a collection.
2. Implement a method `play()` that:
   - Deals a card to the player.
   - Asks the player to guess if the next card will be higher or lower.
   - Uses an `Iterator` to maintain the sequence of cards and modify the collection (e.g., removing a dealt card).
3. Determine the game outcome based on the guess compared to the actual next card.

_Example Code Snippet:_

```java
List<Card> deck = /* Initialize a deck of 52 cards */;
// Example use of iterator
Iterator<Card> iterator = deck.iterator();
while (iterator.hasNext()) {
    Card currentCard = iterator.next();
    // Logic to interact with the card
    iterator.remove(); // Demonstrating modification during iteration
}
```

---

### Exercise 5: 🔍 Debugging & Enhancing the Casino Games

**Challenging Task:**

- **Bug Fixing and Enhancement.**

**Instructions:**

1. Review both `NumberGuessingGame` and `CardGame`.
2. Intentionally insert bugs to simulate common errors (e.g., off-by-one errors, logical fallacies).
3. Create a systematic approach for identifying and fixing these bugs.
4. Document your process of finding and fixing the issues, including before-and-after code snippets.

---

### Exercise 6: 🔄 Optional Challenge - Using Inheritance for Casino Games

**Advanced Application:**

- **Avoiding code duplication through inheritance.**

**Instructions:**

1. Refactor your casino games to demonstrate code reuse using inheritance.
2. Create a base class `CasinoGame` with common functionality.
3. Derive specific games like `NumberGuessingGame` and `CardGame` from `CasinoGame`.

_Example Code Outline:_

```java
abstract class CasinoGame {
    // Common properties and methods
}

class NumberGuessingGame extends CasinoGame {
    // Specific implementation
}

class CardGame extends CasinoGame {
    // Specific implementation
}
```

---

## 📝 Submission Guidelines

- Write all code in a well-structured Java project.
- Include comments for clarity and documentation.
- Ensure each part compiles and runs successfully.
- Submit both your source code and written documents.

## 🎉 Conclusion

This project is designed to fortify your understanding of Java through a series of engaging, practical exercises. Good luck, and may your coding be as thrilling as a casino's jackpot!