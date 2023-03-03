package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            System.out.println(player1.name + " won the round \n");
            player1.playerScore += 1;
        }
        else if (player1.pairs == player2.pairs)
        {
            System.out.println("TIE \n");
        }
        else
        {
            System.out.println(player2.name + " won the round \n");
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


    public static void runGame(Player player1, Player player2)
    {
        List<Card> deck = shuffle(); //Creates a new deck

        player1.dealHand(deck); //deals cards to players removing a Card from the deck when dealt
        player2.dealHand(deck); //consider adding a way to deal one card at a time to avoid player 2 bias

        player1.checkForPairs();
        player2.checkForPairs();

        comparePairs(player1, player2);
    }


    public static void main(String[] args) {

        Player tester = new Player("Matt");
        Player tester2 = new Player("Chris");

        while (tester.playerScore < 3 && tester2.playerScore < 3) // first player to 3 wins
        {
            runGame(tester, tester2);
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Press enter for next round \n");
            String pass = sc.nextLine();
        }

        //declare WInner





    }

}