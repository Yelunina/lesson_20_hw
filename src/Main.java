//в классе SmartArray реализовать удаление элемента из массива
public class Main {
    public static void main(String[] args) {
        SmartArray array = new SmartArray();

        System.out.println(array);

        array.add(1);
        System.out.println(array);
        array.add(77);
        System.out.println(array);
        array.add(51);
        System.out.println(array);
        array.add(1);
        System.out.println(array);
        array.add(9);
        System.out.println(array);
        array.add(7);
        System.out.println(array);
        array.add(11);
        System.out.println(array);
        array.add(23);
        System.out.println(array);
        array.add(65);
        System.out.println(array);
        array.add(1);
        System.out.println(array);
        array.add(77);
        System.out.println(array);
        array.add(51);
        System.out.println(array);
        array.add(1);
        System.out.println(array);
        array.add(77);
        System.out.println(array);
        array.add(22);
        System.out.println(array);

        int[] qwe = array.getArray();
        qwe[0] = 555555;
        System.out.println(array);

    }
}