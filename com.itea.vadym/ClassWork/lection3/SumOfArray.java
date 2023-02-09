package ClassWork.lection3;

public class SumOfArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 1, 2};
        int sum = 0;

        for (int i : array1) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}