package Lecture1_Abstractions_Exercise.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRanks[] cardRank = CardRanks.values();
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        Card card = new Card(CardSuits.valueOf(suit), CardRanks.valueOf(rank));
        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, card.calculatePower());
    }
}