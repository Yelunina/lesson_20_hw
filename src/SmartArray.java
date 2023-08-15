import java.util.Arrays;

public class SmartArray {
    private int size = 0;
    private int[] arr;

    public SmartArray() {
        arr = new int[4];
    }

    public SmartArray(int[] ints) {
        this();
        add(ints);
    }

    public void add(int element) {
        if (size == arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    public void add(int... ints) {
        for (int value : ints) {
            add(value);
        }
    }

    private void increaseArray() {
        int[] tempArray = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public String specialToString() {
        return Arrays.toString(arr) + "   size: " + size;
    }

    public int[] getArray() {
        int[] tempArray = new int[size];
        for (int i = 0; i < size; i++) {
            tempArray[i] = arr[i];
        }
        return tempArray;
    }

    public int searchByValue(int value) {

        for (int i = 0; i < size; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public boolean deleteByIndex(int index) {
        if (index < 0 || index > size) return false;
        for (int i = index; i < size - 1; i++) {
            // 6, arr[6] = arr[7];
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
        return true;
    }

    public void deleteByChicago(int index) {
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, index);
        System.arraycopy(arr, index + 1, newArray, index, newArray.length - index);
        System.out.println(Arrays.toString(newArray));
        arr = newArray;
        size--;
    }

    public boolean deleteByValue(int value) {
        int idxDeletingElement = searchByValue(value);
        if (idxDeletingElement == -1) return false;

        return deleteByIndex(idxDeletingElement);
    }

    public String toString() { //метод распечатывает только добавленные пользователем значения
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += arr[i] + (i < size - 1 ? ", " : "");
        }
        res += "]";
        return res;
    }

    public String toFullString() { // метод распечатывает в консоль весь массив
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + (i < arr.length - 1 ? ", " : "");
        }
        res += "]";
        return res;
    }

    public void changeValue(int index, int value) {
        if (index < 0 || index > size) return;
        arr[index] = value;
    }

    public void trim() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        arr = result;
    }


}

/*
в классе SmartArray реализовать удаление элемента из массива
 */