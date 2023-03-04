package HomeTask.lection14.TasksFrom1_7;

/*
7. Створити колекцію, яка містить об'єкти HeavyBox.
   Написати метод, який перебирає елементи колекції та перевіряє вагу коробок.
   Якщо вага коробки більша за 300 гр, коробка переміщається в іншу колекцію.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class CollectionTask {
    public static void main(String[] args) {
        Random random = new Random();

        Collection <HeavyBox> heavyBoxes1 = new ArrayList<>();
        Collection <HeavyBox> heavyBoxes2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            heavyBoxes1.add(new HeavyBox(random.nextInt(200, 400)));
        }

        System.out.println("Array 1 before sorting : " + heavyBoxes1);
        System.out.println();
        checkWeight(heavyBoxes1, heavyBoxes2);
        System.out.println("Array 1 after sorting: " + heavyBoxes1 + "\n" +
                "Array 2 after sorting: " + heavyBoxes2);
    }

    private static void checkWeight (Collection <HeavyBox> heavyBoxes1, Collection<HeavyBox> heavyBoxes2){
        for (HeavyBox i : heavyBoxes1) {
            if (i.getWeight() > 300) {
                heavyBoxes2.add(i);
            }
        }
        heavyBoxes1.removeIf(i -> i.getWeight() > 300);
    }
}
