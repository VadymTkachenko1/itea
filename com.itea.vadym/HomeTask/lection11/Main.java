package HomeTask.lection11;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner (System.in);
    public static void main(String[] args) {
        User user = new User();
        try {
            System.out.println("Введіть логін");
            String login = scanner.next();
            System.out.println("Введіть пароль");
            String password = scanner.next();
            System.out.println("Підтвердіть пароль");
            String confirmPassword = scanner.next();
            user.userCheck(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
