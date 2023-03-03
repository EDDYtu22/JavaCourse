
import java.util.Arrays;

public class Stack {

    int[] stack;
    int currIdx;

    public Stack(int size) {
        this.stack = new int[size];
        this.currIdx = 0;
    }

    public void push(int value) {
        if (currIdx == stack.length) {
            System.out.println("Stack FULL!");
            return;
        }
        stack[currIdx++] = value;
    }

    public void pop() {
        if (currIdx == 0) {
            System.out.println("Stack empty -> can't pop!");
            return;
        }
        stack[--currIdx] = 0;
    }

    public String toString() {
        return Arrays.toString(stack).replaceAll(", ", "->");
    }

}
