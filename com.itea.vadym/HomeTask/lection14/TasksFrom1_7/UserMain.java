package HomeTask.lection14.TasksFrom1_7;

/*
4. Користувач вводить набір чисел у вигляді одного рядка "1, 2, 3, 4, 4, 5".
   Позбутися повторюваних елементів у рядку і вивести результат на екран.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа");

        String inputNumbers = scanner.nextLine();
        String[] numbers = inputNumbers.split(", ");
        Set<String> uniqueNumbers = new HashSet<>();

        for (String number : numbers) {
            uniqueNumbers.add(number);
        }
        System.out.println(uniqueNumbers);
    }
}
