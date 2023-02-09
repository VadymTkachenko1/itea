package HomeTask.lection7;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static BaseConverter baseConverter = new BaseConverter();

    public static void main(String[] args) {
        System.out.println("Введіть операцію");
        String operation = scanner.nextLine();
        System.out.println("Введіть температуру");
        double temperature = scanner.nextInt();
        baseConverter.convert(operation, temperature);
    }
}