import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameCardDeck {

    private List<GameCard> cards;

    public GameCardDeck() {
        this.cards = new ArrayList<>();

        for (GameCardSuit suit : GameCardSuit.values()) {
            for (GameCardRank rank : GameCardRank.values()) {
                this.cards.add(new GameCard(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public GameCard drawTop() {
        // GameCard topCard = this.cards.get(this.cards.size()-1);
        return this.cards.remove(this.cards.size() - 1);
    }

    public void printDeck() {
        for (GameCard card : this.cards) {
            System.out.println("Card: " + card.suit + "_" + card.rank.getRepr());
        }
    }

    public int getSize() {
        return this.cards.size();
    }

    // TODO: toString() method
}
