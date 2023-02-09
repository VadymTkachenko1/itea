package ClassWork.lection2;

import java.util.Random;
import java.util.Scanner;

public class Randomizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomInt = random.nextInt(10);
        System.out.println(randomInt);
        String repeat = "y";

        while (repeat.equalsIgnoreCase("y")) {
            System.out.println("Введіть число");
            int answer = scanner.nextInt();

            if (answer == randomInt){
                System.out.println("Ви вгадали");
            }
            else {
                System.out.println("Ви не вгадали");
                System.out.println("Бажаете продовжити?");
                repeat = scanner.next();
            }
        }
    }
}