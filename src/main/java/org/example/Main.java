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





    public static void main(String[] args) {
        //call
//        runGame();
//        Card card_1 = new Card("Spades", "Ace");
//        System.out.println(card_1.value  + " of " + card_1.suit);
        ListMultimap<String, String> deck = ArrayListMultimap.create();

        for (int i = 0; i < 10; i++){
            String newValue = String.format("%s", i + 1);
            deck.put("Spades", newValue);
        }

        System.out.println(deck);
    }

}