package HomeTask.lection14.Task8;

/*
8. Створіть HashMap, що містить пари значень - ім'я іграшки та об'єкт іграшки (клас Product).
   Перебрати та роздрукувати пари значень – entrySet().
   Перебрати та роздрукувати набір із імен продуктів - keySet().
   Перебрати та роздрукувати значення продуктів – values(). Для кожного перебору створити свій метод.
 */

import HomeTask.lection14.Task8.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProductMain {
    public static void main(String[] args) {
        Random random = new Random();
        Map <String, Product> productMap = new HashMap<>();

        productMap.put("Doll", new Product("Barbie", random.nextInt(10, 25)));
        productMap.put("Chocolate", new Product("Milka", random.nextInt(10, 15)));
        productMap.put("Toy", new Product("Car", random.nextInt(10, 30)));
        productMap.put("Drink", new Product("Juice", random.nextInt(5, 15)));

        for (Map.Entry<String, Product> entry : productMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String name : productMap.keySet()) {
            System.out.println(name);
        }

        for (Product product : productMap.values()) {
            System.out.println(product);
        }
    }
}
