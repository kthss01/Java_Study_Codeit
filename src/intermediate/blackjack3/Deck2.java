package intermediate.blackjack3;

import intermediate.cardshuffler.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck2<T extends Card> {
    private ArrayList<T> cards;
    private Random random;

    public Deck2() {
        cards = new ArrayList<>();
        random = new Random();
    }

    public Deck2<T> deal(int count) {
        Deck2<T> hand = new Deck2<>();

        for (int i = 0; i < count; i++) {
            hand.addCard(cards.remove(0));
        }

        return hand;
    }

    public ArrayList<T> getCards() {
        return cards;
    }

    public void addCard(T card) {
        cards.add(card);
    }

    public void print() {
        for (T card : cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}

