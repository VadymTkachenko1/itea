package HomeTask.lection17;

/*
Умова:
дана колекція рядків Arrays.asList("a1", "a2", "a3", "a1")
використовуючи методи filter, findFirst, findAny, skip та count:

Повернути кількість входжень об'єкта «a1»
Повернути перший елемент колекції або 0, якщо колекція порожня
Повернути останній елемент колекції або empty, якщо колекція порожня
Знайти елемент у колекції рівний «a3» або кинути помилку
Повернути третій елемент колекції по порядку
Повернути два елементи починаючи з другого
Вибрати всі елементи шаблону (елемент має 1 у імені)
 */

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class StreamTask1 {
    public static void main(String[] args) {
        List<String> sequence = Arrays.asList("a1", "a2", "a3", "a1");

        //Повернути кількість входжень об'єкта «a1»
        System.out.println(sequence.stream()
                .filter("a1" ::equalsIgnoreCase)
                .count());

        //Повернути перший елемент колекції або 0, якщо колекція порожня
        System.out.println(sequence.stream()
                .findFirst()
                .orElse("0"));

        //Повернути останній елемент колекції або empty, якщо колекція порожня
        System.out.println(sequence.stream()
                .reduce((first, last) -> last)
                .orElse("empty"));

        //Знайти елемент у колекції рівний «a3» або кинути помилку
        System.out.println(sequence.stream()
                .filter("a3" :: equalsIgnoreCase)
                .findAny()
                .orElseThrow(NoSuchElementException::new));

        //Повернути третій елемент колекції по порядку
        System.out.println(sequence.stream()
                .skip(2)
                .findFirst());

        //Повернути два елементи починаючи з другого
        sequence.stream()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);

        //Вибрати всі елементи шаблону (елемент має 1 у імені)
        sequence.stream()
                .filter(element -> element.contains("1"))
                .forEach(System.out::println);
    }
}
