package HomeTask.lection3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        boolean isGrowingArray = true;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                isGrowingArray = false;
                break;
            }
        }
        if (isGrowingArray) {
            System.out.println("Масив є строго зростаючим");
        } else {
            System.out.println("Масив не є строго зростаючим");
        }
    }
}