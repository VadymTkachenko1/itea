package HomeTask.lection4;

import java.util.Scanner;

public class StringTask4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any string");
        String userInput = scanner.nextLine();
        String output = "";

        char[] array = new char[userInput.length()];
        for (int i = 0; i < userInput.length(); i++){
            array[i] = userInput.charAt(i);
        }
        String[] array1 = String.valueOf(array).split(" ");

        for (String s : array1) {
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    output = output.concat(String.valueOf(s.charAt(j)));
                }
            }
            output = output.concat(" ");
        }
        System.out.println(output);
    }
}