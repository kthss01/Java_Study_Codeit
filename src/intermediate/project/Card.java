package intermediate.project;

public class Card {
    // 카드의 모양
    // 1,2,3,4
    // 클로버(Clubs) 하트(Hearts) 다이아몬드(Diamonds) 스페이드(Spades)
    public final int suitNumber;

    // 카드의 값
    // 1, 11, 12, 13 은
    // Ace Jack Queen King으로 나머지는 숫자 자체
    public final int rankNumber;

    public Card(int suitNumber, int rankNumber) {
        this.suitNumber = suitNumber;
        this.rankNumber = rankNumber;
    }

    public String getSuit() {
        String suit = "";

        switch (suitNumber) {
            case 1:
                suit = "Clubs";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Diamonds";
                break;
            case 4:
                suit = "Spades";
                break;
        }

        return suit;
    }

    public String getRank() {
        String rank = "";

        switch (rankNumber) {
            case 1:
                rank = "Ace";
                break;
            case 11:
                rank = "Jack";
                break;
            case 12:
                rank = "Queen";
                break;
            case 13:
                rank = "King";
                break;
            default:
                rank = String.valueOf(rankNumber);
                break;
        }

        return rank;
    }

    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
