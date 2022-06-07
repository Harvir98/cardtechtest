package com.nology;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CardGame cardGame1 = new CardGame(new ArrayList<Card>(), "blackjack");
//        cardGame1.createDeck();
//        System.out.println(cardGame1.dealCard());
//        cardGame1.sortDeckByNumber();
//        cardGame1.sortDeckBySuit();
//        cardGame1.shuffleDeck(cardGame1.getDeckOfCards());
        Snap snap1 = new Snap(new ArrayList<>(), "snap");
        snap1.run();
    }
}
