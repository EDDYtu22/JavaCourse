public class DynamicArray {

    // addElement
    // removeElement
    // size
    // slice

    private int[] innerArr;
    private int currIdx;
    private int cappacity;

    public DynamicArray() {
        this.innerArr = new int[9];
        this.currIdx = 0;
        this.cappacity = 9;
    }

    public void add(int value) {

        // 1. inner array too small need to reszise
        // 2. inner array ok we append

        if (this.currIdx == this.cappacity) {
            this.resziseInnnerArray();
        }
        this.innerArr[currIdx] = value;
        currIdx++;
    }

    public void add(int value, int index) {
        if (index < 0 || index > this.currIdx) {
            System.out.println("Error!");
            return;
        }
        if (index == this.currIdx) {
            this.add(value);
            return;
        }
        this.innerArr[index] = value;

    }

    private void resziseInnnerArray() {
        int[] temp = this.innerArr;
        this.innerArr = new int[this.cappacity * 2];
        for (int i = 0; i < temp.length; i++) {
            this.innerArr[i] = temp[i];
        }

    }
}
