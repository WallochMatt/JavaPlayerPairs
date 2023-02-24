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

    public Set<Card> checkForPairs()
    {
        int pairCount = 0;
        final Set<Card> setToReturn = new HashSet<>();
        final Set<Card> set1 = new HashSet<>();

        hand.forEach(i -> {
            System.out.println(i.value + " of " + i.suit);
        });

//        for (Card myCard : hand) {
//            if (!set1.add(myCard)) {
//                setToReturn.add(myCard);
//            }
//        }
        //referencing forum for Set
   // https://stackoverflow.com/questions/7414667/identify-duplicates-in-a-list

        return setToReturn;
    }

}