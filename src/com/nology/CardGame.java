package com.nology;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CardGame  {

    private ArrayList<Card> deckOfCards;
    private String name;

    public CardGame(ArrayList<Card> deckOfCards, String name) {
        this.deckOfCards = deckOfCards;
        this.name = name;
    }

    public void createDeck() {
        String[] symbol = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < 13 ; i++) {
            deckOfCards.add(new Card("♠", symbol[i], i+2));
            deckOfCards.add(new Card("♣", symbol[i], i+2));
            deckOfCards.add(new Card("♥", symbol[i], i+2));
            deckOfCards.add(new Card("♦", symbol[i], i+2));
        }
//        System.out.println(deckOfCards);
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public Card dealCard(ArrayList<Card> cards) {

        cards.get(0);
        return cards.remove(0);

    }

    public void sortDeckByNumber() {
        Comparator<Card> sortedByNumber = Comparator.comparing(Card::getValue);
        Collections.sort(deckOfCards, sortedByNumber);
        System.out.println(deckOfCards);
    }

    public void sortDeckBySuit() {
        Comparator<Card> sortedByNumber = Comparator.comparing(Card::getSuit);
        Collections.sort(deckOfCards, sortedByNumber);
        System.out.println(deckOfCards);
    }

    public void shuffleDeck(ArrayList<Card> cards) {
        Collections.shuffle(cards);
//        System.out.println(cards);
    }


}
