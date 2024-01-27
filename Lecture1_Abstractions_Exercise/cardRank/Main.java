package Lecture1_Abstractions_Exercise.cardRank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        CardRanks[] cardRanks = CardRanks.values();
        printRanks(cardRanks);
    }
    private static void printRanks(CardRanks[] CardRanks) {
        for (CardRanks cardRank: CardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }
    }
}