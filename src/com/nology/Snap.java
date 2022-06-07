package com.nology;

import java.util.*;

public class Snap extends CardGame{

    private Scanner scanner = new Scanner(System.in);
    private List<Card> cardList = getDeckOfCards();
    private ArrayList<Card> newDeck = new ArrayList<>();

    public Snap(ArrayList<Card> deckOfCards, String name) {
        super(deckOfCards, name);
    }

    public void run() {
        setUpGame();
        System.out.println("Please press enter to start the game");
        String input = scanner.nextLine();
        playerTurn();
    }

    public void setUpGame() {
        createDeck();
        newDeck.addAll(getDeckOfCards());
        shuffleDeck(newDeck);
        System.out.println(newDeck);

    }

    public void playerTurn() {
        Card drawnCard = dealCard(newDeck);

        ArrayList<Card> compareList = new ArrayList<>();
        compareList.add(drawnCard);
        System.out.println("Press enter to draw a card");
        String input = scanner.nextLine();
        Card drawnCard2 = dealCard(newDeck);
        compareList.add(drawnCard2);
        System.out.println(compareList.toString());
        Comparator<Card> compareCard = Comparator.comparing(Card::getSymbol);
//        System.out.println(compareCard);
        if(compareCard.compare(drawnCard, drawnCard2) == 0) {
            System.out.println("SNAP");
        } else {
            playerTurn();
        }

    }


}
