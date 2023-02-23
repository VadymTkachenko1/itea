package HomeTask.lection9;//Task 2

import java.util.ArrayList;

public class Payment {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct (int price, String product) {
        Product newProduct = new Product(price, product);
        products.add(newProduct);
    }
    static class Product {
        int price;
        String name;
        public Product (int price, String name) {
            this.price = price;
            this.name = name;
        }
    }
}