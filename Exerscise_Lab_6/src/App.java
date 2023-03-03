import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        // GameCardDeck deck = new GameCardDeck();

        // System.out.println(deck.toString());
        DynamicArray arr = new DynamicArray();
        arr.add(4);
        arr.add(5);
        arr.add(34);
        arr.add(35);
        arr.add(36);
        
        
        arr.printDynArr();
        System.out.println("---------------------");
        arr.trimToSize();

        arr.printDynArr();

        System.out.println("Size of the dynamis Array: " + arr.size());
        System.out.println("Sliced array: " + Arrays.toString(arr.slice(1, 5)));

        // Stack edo = new Stack(5);
        // edo.push(9);
        // edo.push(4);
        // edo.push(2);
        // System.out.println(edo.toString());
        // edo.pop();
        // System.out.println(edo.toString());
        // edo.push(909);
        // System.out.println(edo.toString());
        // edo.push(89);
        // edo.push(6776);
        // System.out.println(edo.toString());
        // edo.push(65);
        // edo.pop();
        // edo.pop();
        // edo.pop();
        // edo.pop();
        // edo.pop();
        // edo.pop();
        // System.out.println(edo.toString());
    }
}
