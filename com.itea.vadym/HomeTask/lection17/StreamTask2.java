package HomeTask.lection17;

/*
Умова:
дано дві колекції collection1 = Arrays.asList("a1", "a2", "a3", "a1")
і collection2 = Arrays.asList("1,2,0", "4,5")
використовуючи map функції

Додати "_1" до кожного елемента першої колекції
У першій колекції прибрати перший символ та повернути масив чисел (int[])
З другої колекції отримати всі числа, перераховані через кому з усіх елементів
З другої колекції отримати суму всіх чисел, перерахованих через кому
 */

import java.util.Arrays;
import java.util.List;

public class StreamTask2 {
    public static void main(String[] args) {
        List<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
        List<String> collection2 = Arrays.asList("1, 2, 0", "4, 5");

        //Додати "_1" до кожного елемента першої колекції
        collection1.stream()
                .map(element -> element + "_1")
                .forEach(System.out::println);

        //У першій колекції прибрати перший символ та повернути масив чисел (int[])
        int [] result = collection1.stream()
                .mapToInt(element -> Integer.parseInt(element.substring(1)))
                .toArray();
        System.out.println(Arrays.toString(result));

        //З другої колекції отримати всі числа, перераховані через кому з усіх елементів
        collection2.stream()
                .map(element -> element + ",")
                .forEach(System.out::println);

        //З другої колекції отримати суму всіх чисел, перерахованих через кому
        System.out.println(collection2.stream()
                .flatMapToInt(element -> Arrays.stream(element.split(", "))
                .mapToInt(Integer::parseInt))
                .sum());
    }
}
