package org.example;

import java.util.*;

public class Player {
    public String name;
    public List<Card> hand;

    public Player(String name, List<Card> deck) {
        this.name = name;
        this.hand = dealHand(deck);
    }

    public List<Card> dealHand(List<Card> deck) {
        List<Card> handInMaking = new ArrayList<Card>();
        int numberOfCards = deck.size();
        for (int i = 0; i < 5; i++) {
            int rnd = new Random().nextInt(numberOfCards) + 1;
            handInMaking.add(deck.get(rnd));
            deck.remove(deck.get(rnd));
            numberOfCards -= 1;
        }
        return handInMaking;
    }

    public void checkForPairs()
    {
        int pairCount = hand.size();
        final Set<Card> setToReturn = new HashSet<>();
        final Set<String> copies = new HashSet<>();

        hand.forEach(i -> {
            System.out.println(i.value + " of " + i.suit);
            copies.add(i.value);
        });

        int totalCopies = (int) copies.stream().distinct().count();
        System.out.println(totalCopies);

        int foundPairs = pairCount - totalCopies;


        System.out.println(foundPairs + " Pairs Found!");


    }

}