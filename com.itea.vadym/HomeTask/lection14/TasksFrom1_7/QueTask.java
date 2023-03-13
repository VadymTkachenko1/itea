package HomeTask.lection14.TasksFrom1_7;

/*
6. Створити чергу, що містить об'єкти класу HeavyBox.
   Використовуємо клас ArrayDeque.
   Розмістити об'єкти в чергу за допомогою методу offer().
   Видалити об'єкти методом poll().
 */

import java.util.ArrayDeque;

public class QueTask {
    public static void main(String[] args) {
        ArrayDeque <HeavyBox> arrayDeque = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            arrayDeque.offer(new HeavyBox(i));
        }

        System.out.println(arrayDeque);

        for (int i = 0; i < 5; i++){
            arrayDeque.poll();
        }

        System.out.println(arrayDeque);
    }
}
