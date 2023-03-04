package HomeTask.lection14.TasksFrom1_7;

import java.util.ArrayList;
import java.util.Arrays;

/*
2. Отримати масив, що містить об'єкти класу HeavyBox з колекції трьома способами і вивести на консоль.
 */

public class HeavyBoxMain2 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            boxes2.add(new HeavyBox(i));
        }

        //toArray()
        HeavyBox[] array1 = boxes2.toArray(new HeavyBox[boxes2.size()]);
        System.out.println("Массив 1: " + Arrays.toString(array1));

        //toArray(T[] a)
        HeavyBox[] array2 = new HeavyBox[boxes2.size()];
        boxes2.toArray(array2);
        System.out.println("Массив 2: " + Arrays.toString(array2));

        //copyOf()
        HeavyBox[] array3 = Arrays.copyOf(boxes2.toArray(), boxes2.toArray().length, HeavyBox[].class);
        System.out.println("Массив 3: " + Arrays.toString(array3));
    }
}
