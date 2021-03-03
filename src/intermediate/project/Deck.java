package intermediate.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private Random random;

    public Deck() {
        cards = new ArrayList<>();
        random = new Random();
    }

    public Deck deal(int count) {
        Deck hand = new Deck();

        for (int i = 0; i < count; i++) {
//            hand.addCard(cards.remove(cards.size() - 1));
            hand.addCard(cards.remove(0));
        }

        return hand;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);

//        int shuffleCount = 100;
//        for (int i = 0; i < shuffleCount; i++) {
//            int shuffleIndex1 = random.nextInt(cards.size());
//            int shuffleIndex2 = random.nextInt(cards.size());
//
//            Card tempCard = cards.get(shuffleIndex1);
//            cards.set(shuffleIndex1, cards.get(shuffleIndex2));
//            cards.set(shuffleIndex2, tempCard);
//        }

//        for (int i = 0; i < cards.size(); i++) {
//            int randIndex = random.nextInt(cards.size());
//            Card temp = cards.get(i);
//            cards.set(i, cards.get(randIndex));
//            cards.set(randIndex, temp);
//        }
    }
}
