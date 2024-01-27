package Lecture1_Abstractions_Exercise.cardSuit;

public class Main {
    public static void main(String[] args) {
        CardSuits[] cardSuits = CardSuits.values();
        System.out.println("Card Suits:");
        printCardSuits(cardSuits);
    }

    private static void printCardSuits(CardSuits[] cardSuits) {
        for (CardSuits cardSuit: cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit.name());
        }
    }
}