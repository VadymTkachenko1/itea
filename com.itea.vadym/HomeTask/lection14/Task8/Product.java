package HomeTask.lection14.Task8;

/*
8. Створіть HashMap, що містить пари значень - ім'я іграшки та об'єкт іграшки (клас Product).
   Перебрати та роздрукувати пари значень – entrySet().
   Перебрати та роздрукувати набір із імен продуктів - keySet().
   Перебрати та роздрукувати значення продуктів – values(). Для кожного перебору створити свій метод.
 */

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ", Price: " + price;
    }
}
