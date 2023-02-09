package HomeTask.lection4;

import java.util.Scanner;

public class StringTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st string");
        String userBegin = scanner.nextLine();
        StringBuilder builder = new StringBuilder(userBegin);
        System.out.println("Enter 2nd string");
        String userEnd = scanner.nextLine();
        System.out.println("The concatenated string: " + builder.append(userEnd));
    }
}