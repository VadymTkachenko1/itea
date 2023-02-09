package ClassWork.lection3;

import java.util.Scanner;

public class SelfArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");

        int size = input.nextInt();
        int[] array = new int[size];
        int sum = 0;

        System.out.println("Insert array elements:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum = array[i] + sum;
        }
        System.out.print("Sum is: ");
        System.out.print(sum);
    }
}
