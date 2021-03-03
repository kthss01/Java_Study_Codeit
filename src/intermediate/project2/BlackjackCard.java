package intermediate.project2;

import intermediate.project.Card;

public class BlackjackCard extends Card {

    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }

   public int getValue() {
        int value = 0;
        String rank = getRank();

        switch (rank) {
            case "Ace":
                value = 11;
                break;
            case "Jack":
            case "Queen":
            case "King":
                value = 10;
                break;
            default:
                value = Integer.valueOf(rank);
                break;
        }

        return value;
   }

   public boolean isAce() {
        return getRank().equals("Ace");
   }
}
