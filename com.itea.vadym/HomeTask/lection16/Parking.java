package HomeTask.lection16;

import java.util.concurrent.Semaphore;

public class Parking {
    private Semaphore carsAllowedToPark;

    public Parking(int inputParkingSize) {
        carsAllowedToPark = new Semaphore(inputParkingSize);
    }

    public Semaphore getCarsAllowedToPark() {
        return carsAllowedToPark;
    }
}
