import java.util.Arrays;

public class SmartArray {
    private int size = 0;
    private int[] array = new int[5];

    public void add(int element) {
        if (size >= array.length) {
            increaseArray();
        }
        array[size] = element;
        size++;
    }


    private void increaseArray() {
        int[] temparray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            temparray[i] = array[i];
        }
        array = temparray;
    }

    public String spesialToString() {
        return Arrays.toString(array) + "   size:" + size;
    }

    public int[] getArray() {
        int[] temparray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temparray[i] = array[i];
        }
        return temparray;
    }

    public String toString() {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += " " + array[i];
        }
        res += "]";
        return res;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;
        }

    }

}