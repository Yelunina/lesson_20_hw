//в классе SmartArray реализовать удаление элемента из массива
import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();

        generateValueForArray(smartArray, 17);

        smartArray.changeValue(5, 99);

        System.out.println(smartArray.toString());
        System.out.println(smartArray.toFullString());

        smartArray.deleteByValue(99);
        smartArray.deleteByIndex(-10);
        System.out.println(smartArray.toString());
        System.out.println(smartArray.toFullString());

        System.out.println();
        System.out.println("==================");
        smartArray.trim();

        smartArray.changeValue(3, 99);
        smartArray.deleteByValue(99);


        System.out.println(smartArray.toString());
        System.out.println(smartArray.toFullString());

        smartArray.deleteByChicago(2);


        int[] ints = {25, 13, 54, 55, 4};

        SmartArray sArray = new SmartArray(ints);
        System.out.println(sArray.toString());












    }





    static void generateValueForArray(SmartArray smartArray, int count) {
        for (int i = 0; i < count; i++) {
            smartArray.add(random.nextInt(101));
        }
    }
}