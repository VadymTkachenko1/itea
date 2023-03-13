package HomeTask.lection15;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.Semaphore;

public class Factory {
    Semaphore loadUnloadSpace = new Semaphore(1);
    private final int maxContainersCount = 10;
    private ArrayList<Container> containersInStock;
    public Factory(ArrayList<Container> containersInStock) {
        this.containersInStock = containersInStock;
    }

    public int getMaxContainersCount() {
        return maxContainersCount;
    }

    public ArrayList<Container> getContainersInStock() {
        return containersInStock;
    }

    public void handleTrains(ArrayList<Train> trains) {
        for (Train train : trains) {
            new Thread(new FactoryThread(loadUnloadSpace, train)).start();
        }
    }

    public void loadUnload(Train train) throws InterruptedException {
        ListIterator<Container> trainIterator = train.getContainersInTrain().listIterator();
        double currentWeight = train.getCurrentWeight();
        printLists(train);
        System.out.println("         Train is unloading");
        while (trainIterator.hasNext()) {
            if (getContainersInStock().size() + 1 <= getMaxContainersCount()) {
                getContainersInStock().add(trainIterator.next());
                currentWeight = currentWeight - trainIterator.previous().getContainerWeight();
                trainIterator.remove();
            } else {
                System.out.println("       Factory stock is full");
                break;
            }
        }
        printLists(train);
        ListIterator<Container> factoryIterator = getContainersInStock().listIterator();
        System.out.println("      Loading train from stock");
        while (factoryIterator.hasNext()) {
            if (train.getCurrentWeight() + factoryIterator.next().getContainerWeight() <= train.getMaxCarryWeight()) {
                train.getContainersInTrain().add(factoryIterator.previous());
                currentWeight = currentWeight + (factoryIterator.next().getContainerWeight());
                factoryIterator.remove();
            } else {
                System.out.println("           Train is full");
                break;
            }
        }
        printLists(train);
        System.out.println("         Train left stock");
    }
    private void printLists(Train train) {
        if (train.getContainersInTrain().size() > 0) {
            System.out.println("---------  Train content  ---------");
        } else {
            System.out.println("---------  Train is empty  ---------");
        }

        for (int i = 0; i < train.getContainersInTrain().size(); i++) {
            System.out.println(train.getContainersInTrain().get(i));
        }

        if (getContainersInStock().size() > 0) {
            System.out.println("-------  Container content  --------");
        } else {
            System.out.println("-------  Container is empty  -------");
        }
        for (int i = 0; i < getContainersInStock().size(); i++) {
            System.out.println(getContainersInStock().get(i));
        }
    }

    public class FactoryThread extends Thread {
        Train train;
        Semaphore semaphore;
        public FactoryThread(Semaphore semaphore, Train train) {
            this.train = train;
            this.semaphore = semaphore;
        }
        @Override
        public void run() {
            try {
                semaphore.acquire();
                loadUnload(train);
                Thread.sleep(500);
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
