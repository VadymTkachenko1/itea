package HomeTask.lection3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int maximum = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-15, 15);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maximum) {
                maximum = array[i];
                index = i;
            }
        }
        System.out.println("Maximum is: " + maximum);
        System.out.println("Array index is: " + index);
    }
}