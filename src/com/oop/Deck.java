package com.oop;

public class Deck {

    public static int numSuits = 4;
    public static int numRanks = 13;

    private Card[][] cards;

    public Deck() {
        cards = new Card[numSuits][numRanks];
        for (int suit = Card.SPADES; suit <= Card.CLUBS; suit++) {
            for (int value = Card.ACE; value <= Card.KING; value++) {
                cards[suit - 1][value - 1] = new Card(value, suit);
            }
        }
    }

    public Card getCard(int suit, int value) {
        return cards[suit - 1][value - 1];
    }
}
