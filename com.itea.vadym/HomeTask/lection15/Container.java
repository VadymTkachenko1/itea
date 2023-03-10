package HomeTask.lection15;

public class Container {
    private double containerWeight;
    private String containerType;

    public Container(double containerWeight, String containerType) {
        this.containerWeight = containerWeight;
        this.containerType = containerType;
    }

    public double getContainerWeight() {
        return containerWeight;
    }

    @Override
    public String toString() {
        return "Container weight " + String.format ("%.2f", containerWeight) +
                " contains " + containerType;
    }
}
