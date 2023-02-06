package HomeTask.lection3;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask5 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double average1 = 0.0;
        double average2 = 0.0;

        for (int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(0, 5);
            array2[i] = random.nextInt(0, 5);
            average1 = average1 + array1[i];
            average2 = average2 + array2[i];
        }
        average1 = average1 / array1.length;
        average2 = average2 / array2.length;

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Average of array 1 : " + average1);
        System.out.println("Average of array 2 : " + average2);

        if (average1 < average2){
            System.out.println("Average mean 2 is greater");
        } else if (average1 == average2){
            System.out.println("Average values are equal");
        } else {
            System.out.println("Average mean 1 is greater");
        }
    }
}