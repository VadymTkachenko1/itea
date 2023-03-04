package HomeTask.lection14.TasksFrom1_7;

import java.util.ArrayList;

/*
1.  а) Створити динамічний масив, що містить об'єкти класу HeavyBox.
    б) Роздрукувати його, використовуючи for each.
    в) Змінити вагу першого ящику на 1.
    г) Видалити останній ящики.
    д) Видалити всі ящики.
 */

public class HeavyBoxMain1 {

    public static void main(String[] args) {
        ArrayList<HeavyBox> boxes1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            boxes1.add(new HeavyBox(i));
        }

        for (HeavyBox i : boxes1) {
            System.out.println(i);
        }

        boxes1.set(0, new HeavyBox(1));
        System.out.println(boxes1);
        boxes1.remove(boxes1.size() - 1);
        System.out.println(boxes1);
        boxes1.clear();
        System.out.println(boxes1);
    }
}
