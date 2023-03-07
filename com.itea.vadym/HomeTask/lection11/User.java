package HomeTask.lection11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    protected boolean userCheck(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        Pattern loginPattern1 = Pattern.compile("[а-яёА-ЯЁ]+");
        Pattern loginPattern2 = Pattern.compile("[0-9]");
        Matcher loginMatcher1 = loginPattern1.matcher(login);
        Matcher loginMatcher2 = loginPattern2.matcher(login);

        if (login.length() > 20) {
            throw new WrongLoginException("Логін не може містити більше ніж 20 символів");
        }
        if (!login.contains("_")){
            throw new WrongLoginException("Логін повинен містити \"_\"");
        }
        if (loginMatcher1.find()) {
            throw new WrongLoginException("Логін повинен складатися лише з латинських букв");
        }
        if (!loginMatcher2.find()) {
            throw new WrongLoginException("Логін повинен містити цифри");
        }

        Pattern passwordPattern1 = Pattern.compile("[а-яёА-ЯЁ]+");
        Pattern passwordPattern2 = Pattern.compile("[0-9]");
        Matcher passwordMatcher1 = passwordPattern1.matcher(password);
        Matcher passwordMatcher2 = passwordPattern2.matcher(password);

        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль не може містити більше ніж 20 символів");
        }
        if (!password.contains("_")){
            throw new WrongPasswordException("Пароль повинен містити \"_\"");
        }
        if (passwordMatcher1.find()) {
            throw new WrongPasswordException("Пароль повинен складатися лише з латинських букв");
        }
        if (!passwordMatcher2.find()) {
            throw new WrongPasswordException("Пароль повинен містити цифри");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Паролі повинні співпадати");
        }
        return true;
    }
}