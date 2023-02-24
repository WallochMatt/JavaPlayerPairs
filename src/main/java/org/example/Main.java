package org.example;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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



    public static  void makeDeck(List<Card> deck, String currentSuit)
    {
        for (int i = 0; i < 10; i++){
            String newValue = String.format("%s", i + 1);
            deck.add(new Card(currentSuit, newValue));
        }
        deck.add(new Card(currentSuit, "Jack"));
        deck.add(new Card(currentSuit, "Queen"));
        deck.add(new Card(currentSuit, "King"));
        deck.add(new Card(currentSuit, "Ace"));

    }


    public static void main(String[] args) {
        //call
        //runGame();

        List<Card> deck = new ArrayList<Card>();

        makeDeck(deck, "Spades");
        makeDeck(deck, "Hearts");
        makeDeck(deck, "Diamonds");
        makeDeck(deck, "Clubs");

        List<Card> hand = new ArrayList<Card>();
        int numberOfCards = 56;
        for (int i = 0; i < 5; i++) {
            int rnd = new Random().nextInt(numberOfCards) + 1;
            hand.add(deck.get(rnd));
            deck.remove(deck.get(rnd));
            numberOfCards -= 1;
        }


        System.out.println(hand);
        System.out.println("Testing...");
//        System.out.println(deck.get(1).value + " of " + deck.get(1).suit);
    }

}