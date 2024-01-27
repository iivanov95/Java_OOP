package Lecture1_Abstractions_Exercise.cardsWithPower;

public class Card {
    private CardSuits cardSuit;
    private CardRanks cardRank;
    private int power;

    public Card(CardSuits cardSuit, CardRanks cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }
    public int calculatePower() {
        return this.cardRank.getValue() + this.cardSuit.getValue();
    }
}