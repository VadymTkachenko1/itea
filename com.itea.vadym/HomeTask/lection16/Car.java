package HomeTask.lection16;

import java.util.concurrent.TimeUnit;

public class Car extends Thread {
    private int carId;
    Parking parking;

    public Car(int carId, Parking parking) {
        this.carId = carId;
        this.parking = parking;
    }

    public int getCarId() {
        return carId;
    }
    @Override
    public void run() {
        try {
            parkCar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void parkCar() throws InterruptedException {
        if (parking.getCarsAllowedToPark().tryAcquire(500, TimeUnit.MILLISECONDS)) {
            System.out.println("Car number " + carId + " parked");
            sleep(2000);
            parking.getCarsAllowedToPark().release();
            System.out.println("Car number " + carId + " left parking spot");
        } else {
            System.out.println("Car number " + carId + " was waiting too long and left");
        }
    }
}
