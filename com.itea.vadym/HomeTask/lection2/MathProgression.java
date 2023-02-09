package HomeTask.lection2;

/*
Задача №5
Необхідно, щоб програма виводила на екран таку послідовність:
7 14 21 28 35 42 49 56 63 70 77 84 91 98
 */

public class MathProgression {

    public static void main (String[] args){
        int result = 0;

        while (result < 98) {
            result = result + 7;
            System.out.println(result);
        }
    }
}