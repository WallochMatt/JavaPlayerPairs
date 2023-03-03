package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {



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
            System.out.println("PLAYER 1 WINS \n");
            player1.playerScore += 1;
        }
        else if (player1.pairs == player2.pairs)
        {
            System.out.println("TIE \n");
        }
        else
        {
            System.out.println("PLAYER 2 WINS \n");
            player2.playerScore += 1;
        }
    }



    public static List<Card> shuffle()
    {
        List<Card> deck = new ArrayList<Card>();
        makeDeck(deck, "Spades");
        makeDeck(deck, "Hearts");
        makeDeck(deck, "Diamonds");
        makeDeck(deck, "Clubs");
        return deck;
    }

    public static void main(String[] args) {


        Player tester = new Player("Player 1");
        Player tester2 = new Player("Player 2");


        List<Card> deck = shuffle(); //Creates a new deck


        tester.dealHand(deck); //deals cards to players removing a Card from the deck when dealt
        tester2.dealHand(deck);

        tester.checkForPairs();
        tester2.checkForPairs();


//        System.out.println(tester.pairs); can access a player's pairs through its memvar now
//        int round = 0;
//        int numberOfRounds = 3;
//
//        while (player1 < numberOfRounds)
//        {
//            round += runGame();
////            System.out.println("One iteration");
//        }
        
    }

}