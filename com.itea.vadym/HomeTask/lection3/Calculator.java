package HomeTask.lection3;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        performCalculation();
        while (true){
            System.out.println("Do you want to repeat calculations?");
            String repeat = scanner.next();
            if (repeat.equalsIgnoreCase("y")){
                performCalculation();
            } else break;
        }
    }
    static void performCalculation(){
        int result = getNumber();
        String operation = getOperation();
        while (!Objects.equals(operation, "=")) {
            result = calc(result, operation);
            operation = getOperation();
        }
    }
    static String getOperation() {
        System.out.println("Enter an operation");
        String operation;
        if (scanner.hasNext()) {
            operation = scanner.next();
        } else {
            System.out.println("Not a valid operation: " + scanner.next());
            operation = getOperation();
        }
        return operation;
    }
    static int getNumber() {
        int number;
        System.out.println("Enter a number");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Not a valid number: " + scanner.next());
            number = getNumber();
        }
        return number;
    }
    static int calc(int result, String operation) {
        int userNumber2 = getNumber();
        switch (operation) {
            case "+" -> result = result + userNumber2;
            case "-" -> result = result - userNumber2;
            case "/" -> result = result / userNumber2;
            case "*" -> result = result * userNumber2;
            default -> {
                System.out.println("Not a valid operation");
                result = calc(result, getOperation());
            }
        }
        System.out.println("Result: " + result);
        return result;
    }
}