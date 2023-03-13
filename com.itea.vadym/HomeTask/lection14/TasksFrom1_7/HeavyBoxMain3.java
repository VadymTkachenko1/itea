package HomeTask.lection14.TasksFrom1_7;

import java.util.ArrayList;
import java.util.TreeSet;

/*
3. Створити TreeSet, що містить HeavyBox. HeavyBox має реалізувати інтерфейс Comparable.
   Надрукувати вміст за допомогою for each.
 */

public class HeavyBoxMain3 {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            boxes3.add(new HeavyBox(i));
        }

        TreeSet<HeavyBox> boxesTreeSet = new TreeSet<>(boxes3);

        for (HeavyBox box : boxesTreeSet) {
            System.out.println(box);
        }
    }
}
