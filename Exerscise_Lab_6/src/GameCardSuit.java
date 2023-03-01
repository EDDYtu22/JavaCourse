public enum GameCardSuit {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private String repr;

    GameCardSuit(String repr) {
        this.repr = repr;
    }

    public String getRepr() {
        return this.repr;
    }
}
