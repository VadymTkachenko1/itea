package HomeTask.lection8;

// Завдання 2

public class UserInformation {
    static User user1 = new User("123", 123);
    static User user2 = new User("123", 123);

    public static void main(String[] args) {
        userCheck();
    }
    protected static void userCheck () {
        if (user1.getUserName().equalsIgnoreCase(user2.getUserName()) && user1.getUserPassword() == user2.getUserPassword()) {
            System.out.println("Ім'я користувача та пароль збігаються");
        } else if (user1.getUserName().equalsIgnoreCase(user2.getUserName()) && user1.getUserPassword() != user2.getUserPassword()) {
            System.out.println("Паролі не збігаються");
        } else {
            System.out.println("Ім'я користувача не збігаються");
        }
    }
}