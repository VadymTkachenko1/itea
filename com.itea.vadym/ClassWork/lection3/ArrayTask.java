package ClassWork.lection3;

import java.util.Random;

public class ArrayTask {

    public static void main(String[] args) {

        Random random = new Random();
        int m = 5;
        int n = 4;
        int[][] array1 = new int[m][n];
        int randomInt;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                randomInt = random.nextInt(90);
                array1[i][j] = randomInt;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d ", array1[i][j]);
            }
            System.out.println();
        }
    }
}