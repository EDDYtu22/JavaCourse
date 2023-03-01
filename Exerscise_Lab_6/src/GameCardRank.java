public enum GameCardRank {
    ACE("Ace"),
    KING("King"),
    QUEEN("Queen"),
    JACK("Jack"),
    N_10("10"),
    N_9("9"),
    N_8("8"),
    N_7("7"),
    N_6("6"),
    N_5("5"),
    N_4("4"),
    N_3("3"),
    N_2("2");

    private String repr;

    GameCardRank(String repr) {
        this.repr = repr;
    }

    public String getRepr() {
        return this.repr;
    }
}
