package org.example;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

import static java.lang.String.format;

public class Main {
    //create
    static void runGame()
    {
        int round = 0;
        int numberOfRounds = 3;
//        int[] playerCount = countsPlayers();

        while (round < numberOfRounds)
        {
            round += 1;
            System.out.println("One iteration");
        }
    };

//    static int[] countsPlayers()
//    {
//        int amountOfPlayers = 3;
//        int[] players = [];
//
//    };

    public static void makeDeck(ListMultimap<String, String> deck, String currentSuit)
    {
        for (int i = 0; i < 10; i++){
            String newValue = String.format("%s", i + 1);
            deck.put(currentSuit, newValue);
        }
        deck.put(currentSuit, "Jack");
        deck.put(currentSuit, "Queen");
        deck.put(currentSuit, "King");
        deck.put(currentSuit, "Ace");
    };



    public static void main(String[] args) {
        //call
        //runGame();

        ListMultimap<String, String> deck = ArrayListMultimap.create();
        makeDeck(deck, "Spades");
        makeDeck(deck, "Hearts");
        makeDeck(deck, "Diamonds");
        makeDeck(deck, "Clubs");

        System.out.println(deck);
    }

}