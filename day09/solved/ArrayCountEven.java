package day09.solved;

public class ArrayCountEven {
    public static void main(String[] args) {
        int[] array = { 2, 5, 8, 3, 10, 6 };
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even elements: " + count);
    }

}
