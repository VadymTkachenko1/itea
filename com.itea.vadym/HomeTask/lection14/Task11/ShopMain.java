package HomeTask.lection14.Task11;

/*
11. Замість масивів використовуйте колекції.
    Створити метод, який роздруковує товари каталогу, відсортовані за ім'ям, ціною або рейтингом.
    Додати можливість сортувати у зворотному порядку. (Інтернет магазин)
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ShopMain {
    public static void main(String[] args) {
        ShopGenerator shopGenerator = new ShopGenerator();
        Scanner scanner = new Scanner(System.in);
        List<Shop> products = new ArrayList<>();
        String inputReverse;
        String inputSortingType;

        for (int i = 0; i < 5; i++) {
            products.add(shopGenerator.getShop());
        }

        printList(products);
        System.out.println("\nEnter sorting type");
        inputSortingType = scanner.next();
        System.out.println("Do you want to reverse the order?");
        inputReverse = scanner.next();
        sortingMethod(products, inputSortingType, inputReverse);
        printList(products);
    }

    private static void sortingMethod(List<Shop> products, String sortingType, String reverse) {
        if (reverse.equals("-")) {
            switch (sortingType.toLowerCase()) {
                case "name" -> products.sort(Comparator.comparing(Shop::getName));
                case "price" -> products.sort(Comparator.comparing(Shop::getPrice));
                case "rating" -> products.sort(Comparator.comparing(Shop::getRating));
            }
        } else if (reverse.equals("+")) {
            switch (sortingType.toLowerCase()) {
                case "name" -> products.sort(Comparator.comparing(Shop::getName).reversed());
                case "price" -> products.sort(Comparator.comparing(Shop::getPrice).reversed());
                case "rating" -> products.sort(Comparator.comparing(Shop::getRating).reversed());
            }
        }
    }

    private static void printList(List<Shop> products){
        for (Shop shop : products) {
            System.out.println(shop);
        }
    }
}
