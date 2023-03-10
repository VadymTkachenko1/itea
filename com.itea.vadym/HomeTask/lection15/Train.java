package HomeTask.lection15;

import java.util.ArrayList;

public class Train {
    private double maxCarryWeight = 6;

    private ArrayList<Container> containersInTrain;

    public Train(ArrayList<Container> containersInTrain) {
        this.containersInTrain = containersInTrain;
    }

    public double getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public ArrayList<Container> getContainersInTrain() {
        return containersInTrain;
    }

    public double getCurrentWeight() {
        double currentWeight = 0;
        for (Container container : containersInTrain) {
            currentWeight = currentWeight + container.getContainerWeight();
        }
        return currentWeight;
    }
}
