package HomeTask.lection4;

import java.util.Scanner;

public class StringTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string");
        String userInput = scanner.nextLine();
        StringBuilder builder = new StringBuilder(userInput);
        String userInputReverse = builder.reverse().toString();

        if (userInput.equalsIgnoreCase(userInputReverse)) {
            System.out.println("\"" + userInput + "\"" + " is a palindrome");
        } else {
            System.out.println("\"" + userInput + "\"" + " is not a palindrome");
        }
    }
}