package HomeTask.lection14.Task11;

public class Shop {
    private String name;
    private int price;
    private double rating;

    public Shop(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return  "Shop name: " + name +
                ", price: " + price +
                ", rating: " + String.format ("%.2f", rating);
    }
}
