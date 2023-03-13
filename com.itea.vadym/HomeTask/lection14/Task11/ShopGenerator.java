package HomeTask.lection14.Task11;

import java.util.Random;

public class ShopGenerator {
    Random random = new Random();
    protected Shop getShop() {
        return new Shop(nameGenerator(), priceGenerator(), ratingGenerator());
    }
    private String nameGenerator() {
        String[] existNames = {"Eggs", "Bread", "Juice", "Flour", "Sausage", "Water"};
        return existNames[random.nextInt(0, 5)];
    }

    private int priceGenerator() {
        return random.nextInt(10, 50);
    }

    private double ratingGenerator() {
        return random.nextDouble(0, 5);
    }
}
