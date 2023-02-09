package OwnTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter array size");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int average = 0;
        int compare = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
            average = array[i] + average;
        }
        average = average / array.length;

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));
        System.out.println("Average: " + average);

        for (int i : array) {
            if (i > compare) {
                compare = i;
            }
        }
        System.out.println("The biggest to average number is: " + compare);
    }
}