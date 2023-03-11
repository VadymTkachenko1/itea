package HomeTask.lection17;

/*
Умова:
Дана колекція чисел Arrays.asList(1, 2, 3, 4, 2)
за допомогою reduce.

Отримати суму чисел або повернути 0
Повернути максимум або -1
Повернути суму непарних чисел або 0
 */

import java.util.Arrays;
import java.util.List;

public class StreamTask4 {
    public static void main(String[] args) {
        List<Integer> sequence = Arrays.asList(1, 2, 3, 4, 2);

        //Отримати суму чисел або повернути 0
        System.out.println(sequence.stream()
                .reduce(Integer::sum)
                .orElse(0));

        //Повернути максимум або -1
        System.out.println(sequence.stream()
                .reduce(Integer::max)
                .orElse(-1));

        //Повернути суму непарних чисел або 0
        System.out.println(sequence.stream()
                .filter(element -> element % 2 != 0)
                .reduce(Integer::sum));
    }
}
