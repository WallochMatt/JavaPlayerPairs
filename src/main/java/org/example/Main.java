package org.example;
import java.util.ArrayList;
import java.util.List;

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
//    }; could instantiate as many players as the user wants, and ask/apply the names



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

        Player tester = new Player("p1", deck);
        Player tester2 = new Player("p2", deck);

        tester.checkForPairs();
//        tester2.checkForPairs();
//        System.out.println(tester.pairs); can access a player's pairs through its memvar now

    }

}