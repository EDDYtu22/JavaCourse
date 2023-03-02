import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // GameCardDeck deck = new GameCardDeck();

        // System.out.println(deck.toString());
        // DynamicArray arr = new DynamicArray();
        // arr.add(4);
        // arr.add(5);
        // arr.add(34);
        // arr.add(90);
        // arr.add(67);
        // arr.add(74);
        // arr.add(40);
        // arr.add(24);
        // arr.add(422);
        // arr.add(466);
        // arr.removeElement(9);
        // arr.add(66);
        // arr.printDynArr();
        // System.out.println("---------------------");
        // arr.add(6896, 0);
        // arr.printDynArr();

        // System.out.println("Size of the dynamis Array: " + arr.size());
        // System.out.println("Sliced array: " + Arrays.toString(arr.slice(1, 5)));

        Stack edo = new Stack(5);
        edo.push(9);
        edo.push(4);
        edo.push(2);
        System.out.println(edo.toString());
        edo.pop();
        System.out.println(edo.toString());
        edo.push(909);
        System.out.println(edo.toString());
        edo.push(89);
        edo.push(6776);
        System.out.println(edo.toString());
        edo.push(65);
        edo.pop();
        edo.pop();
        edo.pop();
        edo.pop();
        edo.pop();
        edo.pop();
        System.out.println(edo.toString());
    }
}
