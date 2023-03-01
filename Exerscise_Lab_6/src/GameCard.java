public class GameCard {
    GameCardSuit suit;
    GameCardRank rank;

    public GameCard(GameCardSuit suit, GameCardRank rank) {

        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return this.rank.getRepr() + " " + this.suit.getRepr();
    }

}