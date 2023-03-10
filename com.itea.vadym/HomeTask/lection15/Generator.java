package HomeTask.lection15;

import java.util.ArrayList;
import java.util.Random;

public class Generator {
    Random random = new Random();
    public Factory generateFactory() {
        return new Factory(generateFactoryContainersInStock());
    }

    public Train generateTrain() {
        return new Train(generateTrainContainers());
    }

    public Container generateContainer() {
        return new Container(generateContainerWeight(), generateContainerType());
    }

    private double generateContainerWeight() {
        return random.nextDouble(1, 4);
    }

    private String generateContainerType() {
        String[] type = {"Metal", "Product"};
        return type[random.nextInt(0, 1)];
    }

    private ArrayList<Container> generateFactoryContainersInStock() {
        ArrayList<Container> containers = new ArrayList<>();
        for (int i = 0; i < random.nextInt(10); i++) {
            containers.add(generateContainer());
        }
        return containers;
    }

    private ArrayList<Container> generateTrainContainers() {
        ArrayList<Container> containers = new ArrayList<>();
        double currentWeight = 0;
        for (int i = 0; i < random.nextInt(5); i++) {
            if (currentWeight + generateContainer().getContainerWeight() <= 4) {
                containers.add(generateContainer());
                currentWeight = currentWeight + generateContainer().getContainerWeight();
            } else {
                break;
            }
        }
        return containers;
    }
}
