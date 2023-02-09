package HomeTask.lection2;

/*
Задача №3
Необхідно вивести в консоль таблицю множення на 3
 */

public class Multiplication {

    public static void main (String[] args){
        int multiplicand = 3;
        int factor = 1;

        while (factor <= 10){
            int result = multiplicand * factor;
            System.out.println(multiplicand + " * " + factor + " = " + result);
            factor++;
        }
    }
}