package HomeTask.lection14.Task10;

/*
10. Створіть клас Pet та його спадкоємців Cat, Dog, Parrot.
    Створіть відображення з домашніх тварин, де як ключ виступає ім'я тварини, а як значення клас Pet.
    Додайте у відображення різних тварин.
    Створіть метод, який виводить на консоль усі ключі відображення.
 */
import java.util.HashMap;
import java.util.Map;

public class PetMain {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();

        petMap.put("originalCatName", new Cat());
        petMap.put("originalDogName", new Dog());
        petMap.put("originalParrotName", new Parrot());

        printKeys(petMap);
    }
    private static void printKeys(Map<String, Pet> petMap) {
        for (String name : petMap.keySet()) {
            System.out.println(name);
        }
    }
}
