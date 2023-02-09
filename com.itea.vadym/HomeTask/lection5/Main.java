package HomeTask.lection5;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static StudentGenerator studentGenerator = new StudentGenerator();
    static Group newGroup = new Group(studentGenerator.getGroup(scanner.nextInt()));

    public static void main(String[] args) {
        groupControl();
    }
    private static void groupControl () {
        System.out.println("Введіть \"Пошук\" для пошуку студента \nВведіть \"Група\" для управління групою");
        String inputStep = scanner.next();

        switch (inputStep.toLowerCase()) {
            case "пошук" -> {
                System.out.println("Введіть прізвище студента");
                newGroup.studentSearch(scanner.next());
                groupControl();
            }
            case "група" -> groupManipulation();
        }
    }
    private static void groupManipulation () {
        while (true) {
            System.out.println("Введіть \"+\", щоб додати студента або \"-\" щоб видалити");
            newGroup.studentManipulation(scanner.next());
            System.out.println("Бажаєте повторити?");
            String repeat = scanner.next();
            if (repeat.equalsIgnoreCase("+")){
                groupManipulation();
            } else {
                break;
            }
        }
    }
}