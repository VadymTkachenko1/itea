package HomeTask.lection16;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int parkingSize = random.nextInt(1,10);
        System.out.println("Maximum parking spots: " + parkingSize);
        Parking parking = new Parking(parkingSize);

        for (int i = 0; i < 10; i++) {
            Car car = new Car(i, parking);
            System.out.println("Car " + car.getCarId() + " entered the parking lot");
            car.start();
        }
    }
}
