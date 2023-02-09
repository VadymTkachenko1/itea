package HomeTask.lection4;

import java.util.Scanner;

public class StringTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st string");
        String str1 = scanner.nextLine();
        System.out.println("Enter 2nd string");
        String str2 = scanner.nextLine();

        int compare = str1.compareToIgnoreCase(str2);

        if (compare == 0){
            System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\"" + " and " + "\"" + str2 + "\"" + " are not equal");
        }
    }
}