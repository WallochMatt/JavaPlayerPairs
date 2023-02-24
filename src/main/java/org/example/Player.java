package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

}