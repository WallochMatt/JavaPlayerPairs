package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void runGame()
    {
        int round = 0;
        int numberOfRounds = 3;

        while (round < numberOfRounds)
        {
            round += 1;
            System.out.println("One iteration");
        }
    };


//could instantiate as many players as the user wants, and ask/apply the names


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


    public static void comparePairs(Player player1, Player player2)
    {
        if (player1.pairs > player2.pairs)
        {
            System.out.println("PLAYER 1 WINS");
        }
        else if (player1.pairs == player2.pairs)
        {
            System.out.println("TIE");
        }
        else
        {
            System.out.println("PLAYER 2 WINS");
        }
    }


    public static void main(String[] args) {

        List<Card> deck = new ArrayList<Card>();
        makeDeck(deck, "Spades");
        makeDeck(deck, "Hearts");
        makeDeck(deck, "Diamonds");
        makeDeck(deck, "Clubs");

        Player tester = new Player("Player 1", deck);
        Player tester2 = new Player("Player 2", deck);

        tester.checkForPairs();
        tester2.checkForPairs();
//        System.out.println(tester.pairs); can access a player's pairs through its memvar now

        comparePairs(tester, tester2);

    }

}