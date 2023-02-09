package HomeTask.lection2;

/*
Задача №6
Необхідно вивести в консоль таку послідовність чисел:
1 2 4 8 16 32 64 128 256 512
 */

public class GeoProgression {

    public static void main (String[] args){
        int result = 1;

        while (result <= 512){
            System.out.println(result);
            result = result * 2;
        }
    }
}