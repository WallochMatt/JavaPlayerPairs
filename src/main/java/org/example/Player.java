package org.example;

import java.util.*;

public class Player {

    public String name;
    public List<Card> hand;
    public int pairs;
    public int playerScore;

    //Constructor
    public Player(String name) {
        this.name = name;
    }

    public void dealHand(List<Card> deck)
    {
        List<Card> handInMaking = new ArrayList<Card>();
        int numberOfCards = deck.size();
        for (int i = 0; i < 5; i++) {
            int rnd = new Random().nextInt(numberOfCards);
            handInMaking.add(deck.get(rnd));
            deck.remove(deck.get(rnd));
            numberOfCards -= 1;
        }
        this.hand = handInMaking;
    }

    public void checkForPairs()
    {
        int pairCount = hand.size();
        final Set<String> copies = new HashSet<>();

        System.out.println(name + "'s Cards: ");
        hand.forEach(i -> {
            System.out.println(i.value + " of " + i.suit);
            copies.add(i.value);
        });

        int totalCopies = (int) copies.stream().distinct().count();
        pairs = pairCount - totalCopies;

        System.out.println(pairs + " Pairs Found! \n");
    }

}