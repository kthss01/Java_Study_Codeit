package intermediate.blackjack3;

import intermediate.blackjack.BlackjackCard;

public class BlackjackHand2 extends Deck2<BlackjackCard> {

    public int getValue() {
        int value = 0;

        int aceCount = 0;

        for (BlackjackCard card : getCards()) {

            if (card.isAce()) {
                aceCount++;
            }

            value += card.getValue();
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
