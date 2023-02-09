package HomeTask.lection2;

import java.util.Scanner;

/*
Задача №4
Напишіть програму, де користувач вводить будь-яке ціле позитивне число.
Програма суммує всі цифри від 1 до введеного користувача числом.
 */

public class Sum {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число");
        int inputSum = scanner.nextInt();
        int result;

        result = (inputSum * (inputSum + 1)) / 2;
        System.out.println(result);
    }
}
/*
        2 спосіб
        int result = 0;

        for (int i = 1; i <= inputSum; i++){
            result = result + i;
            System.out.println(result);
        }
 */