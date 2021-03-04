package intermediate.blackjack2;

import intermediate.blackjack.BlackjackCard;
import intermediate.cardshuffler.Card;
import intermediate.cardshuffler.Deck;

public class BlackjackHand extends Deck {

    public int getValue() {
        int value = 0;

        int aceCount = 0;

        for (Card card : getCards()) {
            BlackjackCard bjCard = (BlackjackCard) card;

            if (bjCard.isAce()) {
                aceCount++;
            }

            value += bjCard.getValue();
        }

        while (aceCount > 0 && value > 21) {
            value -= 10;
            aceCount--;
        }

        return value;
    }

    public boolean isBusted() {
        return getValue() > 21;
    }

    public boolean isBlackjack() {
        return getCards().size() == 2 && getValue() == 21;
    }
}
