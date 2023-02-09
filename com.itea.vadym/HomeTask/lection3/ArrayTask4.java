package HomeTask.lection3;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTask4 {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4"};
        String storage;

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++){
            for(int j = i; j >= 0; j--){
                if (!Objects.equals(array[j], array[j + 1])){
                    storage = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = storage;
                }
            }
        }
        System.out.println("After");
        System.out.println(Arrays.toString(array));
    }
}