package HomeTask.lection17;

/*
Умова:
Дана колекція рядків Arrays.asList("a1", "b2", "c3", "a1")
використовуючи collect та toArray

Отримати список без дублікатів
Отримати масив рядків без дублікатів та у верхньому регістрі
Об'єднати всі елементи в один рядок через роздільник ':' і обернути тегами <b>… </b>
Перетворити на map, де перший символ ключ, другий символ значення
Перетворити на map, згрупувавши за першим символом рядки
Перетворити на map, згрупувавши за першим символом рядки і об'єднаємо другі символи через ':'
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTask5 {
    public static void main(String[] args) {
        List<String> sequence = Arrays.asList("a1", "b2", "c3", "a1");

        //Отримати список без дублікатів
        System.out.println(sequence.stream()
                .distinct()
                .collect(Collectors.toList()));

        //Отримати масив рядків без дублікатів та у верхньому регістрі
        System.out.println(Arrays.toString(sequence.stream()
                .distinct()
                .map(String::toUpperCase)
                .toList()
                .toArray(new String[0])));

        //Об'єднати всі елементи в один рядок через роздільник ':' і обернути тегами <b>… </b>
        System.out.println(sequence.stream()
                .collect(Collectors.joining(":", "<b>", "</b>")));

        //Перетворити на map, де перший символ ключ, другий символ значення
        Map<Character, Character> result1 = sequence.stream()
                .distinct()
                .collect(Collectors.toMap(a -> a.charAt(0), b -> b.charAt(1)));
        System.out.println(result1);

        //Перетворити на map, згрупувавши за першим символом рядки
        Map<Character, List<String>> result2 = sequence.stream()
                .collect(Collectors.groupingBy(a -> a.charAt(0)));
        System.out.println(result2);

        //Перетворити на map, згрупувавши за першим символом рядки і об'єднаємо другі символи через ':'
        Map<Object, String> result3 = sequence.stream()
                .collect(Collectors.groupingBy(a -> a.charAt(0), Collectors.joining(":")));
        System.out.println(result3);
    }
}
