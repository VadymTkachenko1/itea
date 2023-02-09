package HomeTask.lection3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Before");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length ; i++){
            if (i % 2 != 0){
                array[i] = 0;
            }
        }
        System.out.println("After");
        System.out.println(Arrays.toString(array));
    }
}