public class App {
    public static void main(String[] args) throws Exception {
        GameCardDeck deck = new GameCardDeck();
        // deck.printDeck();
        deck.shuffle();
        System.out.println("---------------------");
        deck.printDeck();
        System.out.println("---------------------");

        System.out.println(deck.getSize());
        deck.drawTop();
        System.out.println(deck.getSize());

    }
}
